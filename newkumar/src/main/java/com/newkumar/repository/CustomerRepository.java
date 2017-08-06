package com.newkumar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newkumar.model.CustomerMaster;

public interface CustomerRepository  extends JpaRepository<CustomerMaster, Long>{

}
