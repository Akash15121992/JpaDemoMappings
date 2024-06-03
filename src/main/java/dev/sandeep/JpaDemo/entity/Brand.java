package dev.sandeep.JpaDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Brand extends BaseModel{
    private String brandName;
    @OneToMany(mappedBy = "brand")
    private List<CarModel> models;
}
