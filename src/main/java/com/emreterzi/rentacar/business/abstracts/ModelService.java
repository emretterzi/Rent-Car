package com.emreterzi.rentacar.business.abstracts;

import com.emreterzi.rentacar.business.requests.CreateModelRequest;
import com.emreterzi.rentacar.business.requests.UpdateBrandRequest;
import com.emreterzi.rentacar.business.requests.UpdateModelRequest;
import com.emreterzi.rentacar.business.responses.GetAllModelsResponse;
import com.emreterzi.rentacar.business.responses.GetByIdBrandResponse;
import com.emreterzi.rentacar.business.responses.GetByIdModelResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();

    GetByIdModelResponse getById(int id);
    void add(CreateModelRequest createModelRequest);
    void delete(int id);

    void update(UpdateModelRequest updateModelRequest);




}
