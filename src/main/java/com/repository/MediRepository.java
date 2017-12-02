package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Medi;
import java.util.List;

public interface MediRepository extends JpaRepository<Medi, Long> {
    @Query("select nextval('medi_seq') ")
    public int getNextSeq();
}