package com.emreterzi.rentacar.business.rules;

import com.emreterzi.rentacar.core.utulities.exceptions.BusinessException;
import com.emreterzi.rentacar.dataAccsess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ModelBusinessRules {
    private ModelRepository modelRepository;

    public void checkIfModelNameExist(String name){
        if (this.modelRepository.existsByName(name)){
            throw new BusinessException("Model Name Already Exist");  //java exception types
        }

    }


}
