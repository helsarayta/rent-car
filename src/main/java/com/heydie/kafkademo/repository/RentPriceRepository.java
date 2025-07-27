package com.heydie.kafkademo.repository;

import com.heydie.kafkademo.entity.RentPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentPriceRepository extends JpaRepository<RentPrice, Long> {
}
