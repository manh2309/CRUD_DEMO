package com.example.cruddemo.AdminModule.Controller;

import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeRequest;
import com.example.cruddemo.AdminModule.Service.SizeService.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/size")
public class SizeController {
    @Autowired
    ISizeService iSizeService;
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return  new ResponseEntity<>(iSizeService.findAll(), HttpStatus.OK);
    }
    @GetMapping("getOneSize")
    public  ResponseEntity<?> getOneSize(@RequestParam("id") int id){
       return new ResponseEntity<>(iSizeService.getOne(id), HttpStatus.OK);
    }

    @PostMapping("addSize")
    public ResponseEntity<?> addSize(@RequestBody SizeRequest sizeRequest){
        return new ResponseEntity<>(iSizeService.addSize(sizeRequest), HttpStatus.CREATED);
    }
}
