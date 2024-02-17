package com.example.cruddemo.AdminModule.Repository;

import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeReposity extends JpaRepository<SizeEntity, Integer> {
}
