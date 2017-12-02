package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Medi;
import java.util.List;

public interface MediRepository extends JpaRepository<Medi, Long> {
  public List<Medi> findByKey(String key); 
}