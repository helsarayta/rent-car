package com.heydie.kafkademo.repository;

import com.heydie.kafkademo.entity.CarCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarCategoryRepository extends JpaRepository<CarCategory, Long> {
}
