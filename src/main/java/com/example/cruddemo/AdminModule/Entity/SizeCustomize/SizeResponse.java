package com.example.cruddemo.AdminModule.Entity.SizeCustomize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SizeResponse {
    private Integer maSize;
    private String size_name;
    private Boolean is_deleted;
    private  Boolean is_active;
    private LocalDateTime create_date;
}
