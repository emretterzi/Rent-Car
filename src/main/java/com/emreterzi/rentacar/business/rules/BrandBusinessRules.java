package com.emreterzi.rentacar.business.rules;

import com.emreterzi.rentacar.core.utulities.exceptions.BusinessException;
import com.emreterzi.rentacar.dataAccsess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class BrandBusinessRules {
    private BrandRepository brandRepository;
    public void checkIfBrandNameExist(String name){
        if (this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand Name Already Exist");  //java exception types
        }



    }

}
