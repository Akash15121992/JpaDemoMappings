package dev.sandeep.JpaDemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class CarModel extends BaseModel{
    private String modelName;
    @ManyToOne(fetch = FetchType.LAZY)
    //@ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;
}
