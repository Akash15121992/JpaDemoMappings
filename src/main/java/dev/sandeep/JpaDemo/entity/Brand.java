package dev.sandeep.JpaDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Brand extends BaseModel{
    private String brandName;
    //@OneToMany(mappedBy = "brand",fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "brand",fetch = FetchType.LAZY)
    //@OneToMany(mappedBy = "brand")
    private List<CarModel> models;
}
