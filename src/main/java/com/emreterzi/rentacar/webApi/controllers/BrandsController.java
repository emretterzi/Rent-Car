package com.emreterzi.rentacar.webApi.controllers;

import com.emreterzi.rentacar.business.abstracts.BrandService;
import com.emreterzi.rentacar.business.requests.CreateBrandRequest;
import com.emreterzi.rentacar.business.requests.CreateModelRequest;
import com.emreterzi.rentacar.business.requests.UpdateBrandRequest;
import com.emreterzi.rentacar.business.responses.GetAllBrandsResponse;
import com.emreterzi.rentacar.business.responses.GetByIdBrandResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

    private  BrandService brandService;

    @GetMapping("/{id}")
   public GetByIdBrandResponse getByIdBrandResponse(@PathVariable int id){
        return brandService.getById(id);

   }


    @GetMapping()
    public List<GetAllBrandsResponse>getAll(){
        return brandService.getAll();
    }

    @PostMapping()//ekleme yapmak Request ile
    @ResponseStatus(code= HttpStatus.CREATED)
    public String add(@RequestBody() @Valid CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);

        return createBrandRequest+" Brand added.";

    }






    @PutMapping
    public String update(@RequestBody UpdateBrandRequest updateBrandRequest){
        this.brandService.update(updateBrandRequest);
        return "Brand with "+updateBrandRequest.getId()+" ıd number has been updated.";


    }



    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){

        this.brandService.delete(id);

        return "Brand with " +id+ " ıd number x has been deleted.";
    }


}
