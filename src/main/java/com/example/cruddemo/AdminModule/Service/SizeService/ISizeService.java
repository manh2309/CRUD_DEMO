package com.example.cruddemo.AdminModule.Service.SizeService;

import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomResponse;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerReponse;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerRequest;
import com.example.cruddemo.AdminModule.Entity.SizeCustomize.CustomSizeRes;
import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeRequest;
import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ISizeService {
    List<SizeResponse> findAll();
    SizeResponse getOne(int id);

    CustomSizeRes addSize (SizeRequest sizeRequest);
    CustomSizeRes updateSize (Integer id, SizeRequest sizeRequest);
    CustomSizeRes deleteSize (Integer id);
}
