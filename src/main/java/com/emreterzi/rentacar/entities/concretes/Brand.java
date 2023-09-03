package com.emreterzi.rentacar.entities.concretes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="brands")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id otamatik arttırma
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;

    //bir markadan birden çok model olaabilir  one to many
    // markaya ait birden çok modelin bir markası vardır .
    @OneToMany(mappedBy ="brand")  //modelin brand i ile ilişkilendir
    private List<Model>models;



}




