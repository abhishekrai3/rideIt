package com.example.RideIt.repository;

import com.example.RideIt.model.Driver;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

    Driver findByMobNo(String mobNo);
}
