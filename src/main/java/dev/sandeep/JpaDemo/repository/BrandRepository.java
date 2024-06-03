package dev.sandeep.JpaDemo.repository;

import dev.sandeep.JpaDemo.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
