package com.example.cruddemo.AdminModule.Service.CustomerService;

import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomResponse;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerEntity;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerReponse;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICustomerService {
    List<CustomerReponse> findAll();
    CustomerReponse getOne(long id);

    CustomResponse addCustomer (CustomerRequest customerRequest);
    CustomResponse updateCustomer (Long id, CustomerRequest customerRequest);
    CustomResponse deleteCustomer (Long id);
}
