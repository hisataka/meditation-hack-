package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.*;
import java.util.List;

public interface MediRepository extends JpaRepository<Medi, MediKey> {
  public List<Medi> findByKey(String key); 
}