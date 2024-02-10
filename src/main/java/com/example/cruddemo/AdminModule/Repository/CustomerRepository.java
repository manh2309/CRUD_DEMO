package com.example.cruddemo.AdminModule.Repository;

import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
