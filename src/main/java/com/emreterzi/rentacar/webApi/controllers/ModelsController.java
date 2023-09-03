package com.emreterzi.rentacar.webApi.controllers;

import com.emreterzi.rentacar.business.abstracts.ModelService;
import com.emreterzi.rentacar.business.requests.CreateBrandRequest;
import com.emreterzi.rentacar.business.requests.CreateModelRequest;
import com.emreterzi.rentacar.business.requests.UpdateBrandRequest;
import com.emreterzi.rentacar.business.requests.UpdateModelRequest;
import com.emreterzi.rentacar.business.responses.GetAllBrandsResponse;
import com.emreterzi.rentacar.business.responses.GetAllModelsResponse;
import com.emreterzi.rentacar.business.responses.GetByIdBrandResponse;
import com.emreterzi.rentacar.business.responses.GetByIdModelResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController //annotation
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {

    private ModelService modelService;


    @GetMapping()
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }


    @GetMapping("/{id}")
    public GetByIdModelResponse getByIdModelResponse(@PathVariable int id){
        return modelService.getById(id);
    }


    @PostMapping()//ekleme yapmak Request ile
    @ResponseStatus(HttpStatus.CREATED)
    public String add(@RequestBody() @Valid CreateModelRequest createModelRequest){
        this.modelService.add(createModelRequest);

        return createModelRequest+" Model added";


    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteId(@PathVariable int id) {
        this.modelService.delete(id);

        return "Model with " +id+ " ıd number x has been deleted.";
    }





    @PutMapping
    public String update(@RequestBody UpdateModelRequest modelRequest){
        this.modelService.update(modelRequest);

        return "Model with "+modelRequest.getId()+" ıd number has been updated.";

    }





}
