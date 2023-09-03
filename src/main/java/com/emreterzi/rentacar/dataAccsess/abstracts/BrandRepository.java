package com.emreterzi.rentacar.dataAccsess.abstracts;

import com.emreterzi.rentacar.entities.concretes.Brand;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BrandRepository extends JpaRepository<Brand,Integer> {

   boolean existsByName(String name);  //spirng Jpa Keyword  exist var mı demek true yada false döner

}
