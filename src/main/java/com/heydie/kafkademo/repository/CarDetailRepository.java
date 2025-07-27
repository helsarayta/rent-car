package com.heydie.kafkademo.repository;

import com.heydie.kafkademo.entity.CarDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDetailRepository extends JpaRepository<CarDetail, Long> {
}
