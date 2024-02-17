package com.example.cruddemo.AdminModule.Mapping;

import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerEntity;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerReponse;
import com.example.cruddemo.AdminModule.Entity.CustomizeResponse.CustomerRequest;
import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeEntity;
import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeRequest;
import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeResponse;
import lombok.Data;

@Data
public class mapSizeEntity {
    public  static SizeEntity mapRequestToEntity (SizeRequest sizeRequest){
        SizeEntity size = new SizeEntity();
        size.setSize_name(sizeRequest.getSize_name());
        size.setIs_deleted(sizeRequest.getIs_deleted());
        size.setIs_active(sizeRequest.getIs_active());
        size.setCreate_date(sizeRequest.getCreate_date());
        return size;
    }
    public  static SizeResponse mapEntityToResponse (SizeEntity sizeEntity){
        SizeResponse sizeResponse = new SizeResponse();
        sizeResponse.setMaSize(sizeEntity.getId());
        sizeResponse.setSize_name(sizeEntity.getSize_name());
        sizeResponse.setIs_deleted(sizeEntity.getIs_deleted());
        sizeResponse.setIs_active(sizeEntity.getIs_active());
        sizeResponse.setCreate_date(sizeEntity.getCreate_date());
        return sizeResponse;
    }
}
