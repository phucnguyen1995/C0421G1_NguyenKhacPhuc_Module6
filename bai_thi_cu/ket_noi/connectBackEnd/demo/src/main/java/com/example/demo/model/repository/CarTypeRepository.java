package com.example.demo.model.repository;

import com.example.demo.model.entity.CarType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarTypeRepository extends JpaRepository<CarType,Long> {

}
