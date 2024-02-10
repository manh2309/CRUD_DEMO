package com.example.cruddemo.AdminModule.Controller;

import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerRequest;
import com.example.cruddemo.AdminModule.Service.CustomerService.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/customer")
public class customerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/getOne")
    public  ResponseEntity<?> getOne(@RequestParam("id") long id){
        return  new ResponseEntity<>(customerService.getOne(id), HttpStatus.OK);
    }
    @PostMapping("/addCustomer")
    public  ResponseEntity<?> addCus(@RequestBody CustomerRequest customerRequest){
        return  new ResponseEntity<>(customerService.addCustomer(customerRequest), HttpStatus.CREATED);
    }
    @PutMapping("/updateCustomer")
    public  ResponseEntity<?> updateCus(@RequestParam("id") Long id, @RequestBody CustomerRequest customerRequest){
        return new ResponseEntity<>(customerService.updateCustomer(id, customerRequest), HttpStatus.OK);
    }
    @DeleteMapping("/deleteCustomer/{id}")
    public  ResponseEntity<?> deleteCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerService.deleteCustomer(id), HttpStatus.OK);
    }
}
