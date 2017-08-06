package com.newkumar.service;

import com.newkumar.model.CustomerMaster;

public interface CustomerMasterService {

    public CustomerMaster getCustomerMaster(Long customerMaster);
    public CustomerMaster saveCustomerMaster(CustomerMaster customerMaster);
}
