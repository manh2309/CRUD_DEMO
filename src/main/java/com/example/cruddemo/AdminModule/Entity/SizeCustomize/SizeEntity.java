package com.example.cruddemo.AdminModule.Entity.SizeCustomize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "sizes")
@AllArgsConstructor
@NoArgsConstructor
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String size_name;
    private Boolean is_deleted;
    private  Boolean is_active;
    private LocalDateTime create_date;
}
