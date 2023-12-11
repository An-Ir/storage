package com.example.storage.domain.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StorageRepository extends JpaRepository<Storage, Integer> {
    @Query("select s from Storage s where s.status = ?1")
    List<Storage> findByStatus(String status);

}