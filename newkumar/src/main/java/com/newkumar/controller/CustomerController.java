package com.newkumar.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newkumar.model.CustomerMaster;
import com.newkumar.service.CustomerMasterService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerMasterService  customerMasterService;
	@RequestMapping(value="/addNewCustomer",method=RequestMethod.GET)
	public String addNewCustomer(Map<String, Object>  map){
		map.put("customer", new CustomerMaster());
		return "addNewCustomer";
	}
	
	@RequestMapping(value="/saveCustomer",method=RequestMethod.POST)
	public String test(CustomerMaster customerMaster){
		if(customerMaster==null)
		{
			return null;
		}
		customerMasterService.saveCustomerMaster(customerMaster);
		
		return "index";
	}
	
	@RequestMapping(value="/viewCustomer/{customerId}",method=RequestMethod.GET)
	public String viewCustomer(Map<String, Object>  map,@PathVariable Long customerId){
		map.put("customer", customerMasterService.getCustomerMaster(customerId));
		return "viewCustomer";
	}

}
