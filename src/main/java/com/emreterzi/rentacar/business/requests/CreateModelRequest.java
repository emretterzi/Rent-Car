package com.emreterzi.rentacar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
    @NotNull //boş olaamaz
    private String name;
    @NotNull
    private int brandId;
    //@NotNull //boş olaamaz
    //@NotBlank  //boşluklu olamaz
    //@Size(min=3,max=20)  //min 3 karakter en fazla 20 karekter

   //
   // @NotBlank





}
