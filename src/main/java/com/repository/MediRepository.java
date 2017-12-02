package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Medi;
import java.util.List;

public interface MediRepository extends JpaRepository<Medi, long> {
  public List<Medi> findByKey(long key); 
}