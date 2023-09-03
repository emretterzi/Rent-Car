package com.emreterzi.rentacar.business.concretes;

import com.emreterzi.rentacar.business.abstracts.BrandService;
import com.emreterzi.rentacar.business.requests.CreateBrandRequest;
import com.emreterzi.rentacar.business.requests.UpdateBrandRequest;
import com.emreterzi.rentacar.business.responses.GetAllBrandsResponse;
import com.emreterzi.rentacar.business.responses.GetByIdBrandResponse;
import com.emreterzi.rentacar.business.rules.BrandBusinessRules;
import com.emreterzi.rentacar.core.utulities.mappers.ModelMapperService;
import com.emreterzi.rentacar.dataAccsess.abstracts.BrandRepository;
import com.emreterzi.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class BrandManeger implements BrandService  {

    private final BrandRepository brandRepository;
    private  ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;



    @Override
    public  List<GetAllBrandsResponse> getAll() {
        List<Brand>brands=brandRepository.findAll();
        List<GetAllBrandsResponse>getAllBrandsResponseList=brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                                .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());


        return getAllBrandsResponseList;
    }

//veri tabanına request ile kullanıcan ekleme yapmakl
    //repository brand istediği için brand oluşturup düzenleyip save ile yolladık  yolladık

    @Override
    public void add(CreateBrandRequest createBrandRequest) {


        //mapleme işlemi request aldığını Brand e çevir.
       this.brandBusinessRules.checkIfBrandNameExist(createBrandRequest.getName());  //aynı markadan var mı komtrolü

        Brand brand=this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand=this.brandRepository.findById(id).orElseThrow();

        GetByIdBrandResponse response=modelMapperService.forResponse()
                .map(brand,GetByIdBrandResponse.class);

        return response;
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand=this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);


    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);

    }
}
