package com.example.assignment3.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int customer_id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private String country;

    @Column
    private String postcode;

}
