package com.emreterzi.rentacar.dataAccsess.abstracts;

import com.emreterzi.rentacar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository  extends JpaRepository<Model,Integer> {

    boolean existsByName(String name);
}
