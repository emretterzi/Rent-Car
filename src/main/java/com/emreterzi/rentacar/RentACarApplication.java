package com.emreterzi.rentacar;

import com.emreterzi.rentacar.core.utulities.exceptions.BusinessException;
import com.emreterzi.rentacar.core.utulities.exceptions.ProblemDetails;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestControllerAdvice  //giriş kapısı exception handler
public class RentACarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentACarApplication.class, args);
    }



    @ExceptionHandler
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessException(BusinessException businessException){
        ProblemDetails problemDetails=new ProblemDetails();
        problemDetails.setMessage(businessException.getMessage());
        return  problemDetails;


    }

    @ExceptionHandler
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessException(MethodArgumentNotValidException methodArgumentNotValidException){
        ProblemDetails problemDetails=new ProblemDetails();
        problemDetails.setMessage(methodArgumentNotValidException.getMessage());
        return  problemDetails;


    }




    @Bean  //bu bir nesne bunu kutuya ıoc ye ekle bekle dolu olsun
    public ModelMapper getModelMapper(){
        return  new ModelMapper();
    }





}
