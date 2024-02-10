package com.example.cruddemo.AdminModule.Service.CustomerService;


import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomResponse;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerEntity;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerReponse;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerRequest;
import com.example.cruddemo.AdminModule.Mapping.mapCustomerEntity;
import com.example.cruddemo.AdminModule.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CustomerServicelmpl implements ICustomerService {
@Autowired
private CustomerRepository customerRepository;

    @Override
    public List<CustomerReponse> findAll() {
        List<CustomerEntity> customerEntities = customerRepository.findAll();
    List<CustomerReponse> customerReponses = customerEntities.stream().map(mapCustomerEntity::mapEntityToResponse).collect(Collectors.toList());
        return customerReponses;
    }

//    @Override
//    public Optional<CustomerEntity> getOne(String id) {
//        Optional<CustomerEntity> resultEntity = customerRepository.findById(Long.valueOf(id));
//        Optional<CustomerEntity> resultReponse = resultEntity;
//        return resultReponse;
//    }

    @Override
    public CustomerReponse getOne(long id) {
        CustomerEntity resultEntity = customerRepository.findById(id).orElse(null);
        CustomerReponse resultReponse = mapCustomerEntity.mapEntityToResponse(resultEntity);
        return resultReponse;
    }

    @Override
    public CustomResponse addCustomer(CustomerRequest customerRequest) {
        if(customerRequest != null){
            CustomerEntity customerEntity = mapCustomerEntity.mapRequestToEntity(customerRequest);
            customerRepository.save(customerEntity);
            return new CustomResponse("Thêm thành công");
        }
        return new CustomResponse("Thêm thất bại");
    }

    @Override
    public CustomResponse updateCustomer(Long id, CustomerRequest customerRequest) {
            CustomerEntity customerEntity = customerRepository.getById(id);
            if (customerEntity != null){
               mapCustomerEntity.mapEntityToRequest(customerRequest, customerEntity);
//                customerEntity = mapCustomerEntity.mapRequestToEntity(customerRequest);
                customerRepository.save(customerEntity);
                return new CustomResponse("Sửa thành công");
            }
        return new CustomResponse("Sửa thất bại");
    }

    @Override
    public CustomResponse deleteCustomer(Long id) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(id);
        customerRepository.delete(customerEntity);
        return new CustomResponse("Xóa thành công");
    }
//    @Override
//    public List<customerReponse> findAll() {
//    List<customerEntity> customerEntities = customerRepository.findAll();
//    List<customerReponse> customerReponses = customerEntities.stream().map(mapCustomerEntity::mapEntityToResponse).collect(Collectors.toList());
//        return customerReponses;
//    }
}
