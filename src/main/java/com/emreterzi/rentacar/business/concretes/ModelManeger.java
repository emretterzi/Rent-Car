package com.emreterzi.rentacar.business.concretes;

import com.emreterzi.rentacar.business.abstracts.ModelService;
import com.emreterzi.rentacar.business.requests.CreateModelRequest;
import com.emreterzi.rentacar.business.requests.UpdateModelRequest;
import com.emreterzi.rentacar.business.responses.GetAllBrandsResponse;
import com.emreterzi.rentacar.business.responses.GetAllModelsResponse;
import com.emreterzi.rentacar.business.responses.GetByIdBrandResponse;
import com.emreterzi.rentacar.business.responses.GetByIdModelResponse;
import com.emreterzi.rentacar.business.rules.ModelBusinessRules;
import com.emreterzi.rentacar.core.utulities.mappers.ModelMapperService;
import com.emreterzi.rentacar.dataAccsess.abstracts.ModelRepository;
import com.emreterzi.rentacar.entities.concretes.Brand;
import com.emreterzi.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManeger implements ModelService {

    private final ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    private ModelBusinessRules modelBusinessRules;


    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model>models=modelRepository.findAll();

        List<GetAllModelsResponse>getAllModelsResponseList=models.stream()
                .map(model -> this.modelMapperService.forResponse()
                        .map(model,GetAllModelsResponse.class)).collect(Collectors.toList());
        return getAllModelsResponseList;
    }


    @Override
    public void add(CreateModelRequest createModelRequest) {

        this.modelBusinessRules.checkIfModelNameExist(createModelRequest.getName());
        Model model=this.modelMapperService.forRequest().map(createModelRequest,Model.class);
        this.modelRepository.save(model);

    }

    @Override
    public void delete(int id) {
        this.modelRepository.deleteById(id);

    }


    @Override
    public void update(UpdateModelRequest updateModelRequest) {
        Model model=this.modelMapperService.forRequest().map(updateModelRequest,Model.class);
        this.modelRepository.save(model);
    }

    @Override
    public GetByIdModelResponse getById(int id) {

        Model model=this.modelRepository.findById(id).orElseThrow();

        GetByIdModelResponse response=modelMapperService.forResponse()
                .map(model,GetByIdModelResponse.class);


        return response;




    }
}
