package com.emreterzi.rentacar.business.requests;


import com.emreterzi.rentacar.entities.concretes.Brand;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelRequest {

    private int id;
    private  String name;
    private int brandId;

}
