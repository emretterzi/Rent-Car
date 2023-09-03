package com.emreterzi.rentacar.core.utulities.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;

public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();


}
