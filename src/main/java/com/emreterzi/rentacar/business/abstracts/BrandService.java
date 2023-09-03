package com.emreterzi.rentacar.business.abstracts;

import com.emreterzi.rentacar.business.requests.CreateBrandRequest;
import com.emreterzi.rentacar.business.requests.UpdateBrandRequest;
import com.emreterzi.rentacar.business.responses.GetAllBrandsResponse;
import com.emreterzi.rentacar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
     List<GetAllBrandsResponse> getAll();
     GetByIdBrandResponse getById(int id);

     void add(CreateBrandRequest createBrandRequest);
     void update(UpdateBrandRequest updateBrandRequest);
     void delete(int id);







}
