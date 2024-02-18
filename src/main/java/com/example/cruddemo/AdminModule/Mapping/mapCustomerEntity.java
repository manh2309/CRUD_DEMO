package com.example.cruddemo.AdminModule.Mapping;


import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerEntity;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerReponse;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerRequest;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class mapCustomerEntity {
    public  static CustomerEntity mapRequestToEntity (CustomerRequest customerRequest){
        CustomerEntity customer = new CustomerEntity();
        customer.setTenkh(customerRequest.getTenkh());
        customer.setDiachi(customerRequest.getDiachi());
        customer.setDienthoai(customerRequest.getDienthoai());
        return customer;
    }
    //mapping update
    public static void  mapEntityToRequest (CustomerRequest customerRequest,CustomerEntity customerEntity){
        if(customerRequest != null){
            if(customerRequest.getTenkh() != null && customerRequest.getTenkh().equals(customerEntity.getTenkh()) == false) {
                customerEntity.setTenkh(customerRequest.getTenkh());
            }else {
                customerRequest.setTenkh(customerEntity.getTenkh());
            }
            if(customerRequest.getDiachi() != null && customerRequest.getDiachi().equals(customerEntity.getDiachi()) == false) {
                customerEntity.setDiachi(customerRequest.getDiachi());
            }else {
                customerRequest.setDiachi(customerEntity.getDiachi());
            }
            if(customerRequest.getDienthoai() != null && customerRequest.getDienthoai().equals(customerEntity.getDienthoai()) == false) {
                customerEntity.setDienthoai(customerRequest.getDienthoai());
            }else {
                customerRequest.setDienthoai(customerEntity.getDienthoai());
            }
        }

    }
    public  static CustomerReponse mapEntityToResponse (CustomerEntity customerEntity){
        CustomerReponse customerResponse = new CustomerReponse();
        customerResponse.setMakh(customerEntity.getId());
        customerResponse.setTenkh(customerEntity.getTenkh());
        customerResponse.setDiachi(customerEntity.getDiachi());
        customerResponse.setDienthoai(customerEntity.getDienthoai());
        return customerResponse;
    }
}
