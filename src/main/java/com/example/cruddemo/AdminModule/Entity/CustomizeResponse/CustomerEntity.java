package com.example.cruddemo.AdminModule.Entity.CustomizeResponse;



import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "khach_hang")
//@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
//    @Column(name = "tenkh")
    private String tenkh;
//    @Column(name = "diachi")
    private String diachi;
//    @Column(name = "dienthoai")
    private String dienthoai;
}

