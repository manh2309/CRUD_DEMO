package com.example.cruddemo.AdminModule.Service.SizeService;

import com.example.cruddemo.AdminModule.Entity.SizeCustomize.CustomSizeRes;
import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeEntity;
import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeRequest;
import com.example.cruddemo.AdminModule.Entity.SizeCustomize.SizeResponse;
import com.example.cruddemo.AdminModule.Repository.SizeReposity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.cruddemo.AdminModule.Mapping.mapSizeEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SizeServicelmpl implements ISizeService{
@Autowired
    SizeReposity sizeReposity;
    @Override
    public List<SizeResponse> findAll() {
        List<SizeEntity> sizeEntities = sizeReposity.findAll();
        List<SizeResponse> sizeResponses = sizeEntities.stream().map(mapSizeEntity::mapEntityToResponse).collect(Collectors.toList());
        return sizeResponses;
    }

    @Override
    public SizeResponse getOne(int id) {
        SizeEntity sizeEntity = sizeReposity.findById(id).orElse(null);
        SizeResponse sizeResponse = mapSizeEntity.mapEntityToResponse(sizeEntity);
        return sizeResponse;
    }

    @Override
    public CustomSizeRes addSize(SizeRequest sizeRequest) {
        if(sizeRequest != null){
            SizeEntity sizeEntity = mapSizeEntity.mapRequestToEntity(sizeRequest);
            sizeReposity.save(sizeEntity);
            return new CustomSizeRes("Thêm thành công");
        }
        return new CustomSizeRes("Thêm thành công");
    }

    @Override
    public CustomSizeRes updateSize(Integer id, SizeRequest sizeRequest) {
        return null;
    }

    @Override
    public CustomSizeRes deleteSize(Integer id) {
        return null;
    }

}
