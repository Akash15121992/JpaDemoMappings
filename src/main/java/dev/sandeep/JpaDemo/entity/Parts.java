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
public class Parts extends BaseModel{

    private String partsName;
    @OneToMany(mappedBy = "brand",fetch = FetchType.LAZY)
    private List<CarModel> modelList;
}
