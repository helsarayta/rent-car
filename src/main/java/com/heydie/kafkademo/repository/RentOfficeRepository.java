package com.heydie.kafkademo.repository;

import com.heydie.kafkademo.entity.RentOffice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentOfficeRepository extends JpaRepository<RentOffice, Long> {
}
