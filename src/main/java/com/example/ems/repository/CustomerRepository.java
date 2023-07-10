package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ems.model.*;

@Repository
public interface CustomerRepository extends JpaRepository<Customer_details, Integer> {

}
