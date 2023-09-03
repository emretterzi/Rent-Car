package com.emreterzi.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="models")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter

public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //id otamatik arttırma
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;




    //bir modelden birden çok araba olabilir cars içindeki car ın modelı ile ilişkilendirdim
    //ilişkilendirdim
    //@OneToMany(mappedBy = "model") //modeli de carslar la ilişkilendir
    //private List<Car>cars;


    @ManyToOne     // aynı markaya ait birden çok modelin bir markası vardır
    @JoinColumn(name ="brand_id")
    private  Brand brand;

}
