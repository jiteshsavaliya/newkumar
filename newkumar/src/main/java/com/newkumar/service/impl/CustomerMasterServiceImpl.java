package com.newkumar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newkumar.model.CustomerMaster;
import com.newkumar.repository.CustomerRepository;
import com.newkumar.service.CustomerMasterService;


@Service
@Transactional
public class CustomerMasterServiceImpl implements CustomerMasterService{

	@Autowired
	private CustomerRepository customerRepository; 
	@Override
	public CustomerMaster getCustomerMaster(Long customerMaster) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerMaster saveCustomerMaster(CustomerMaster customerMaster) {
		// TODO Auto-generated method stub
		return customerRepository.save(customerMaster);
	}

}
