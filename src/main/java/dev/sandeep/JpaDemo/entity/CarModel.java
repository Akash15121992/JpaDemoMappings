package dev.sandeep.JpaDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CarModel extends BaseModel{
    private String modelName;
    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;
}
