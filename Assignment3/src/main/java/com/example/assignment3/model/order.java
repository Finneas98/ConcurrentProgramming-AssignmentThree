package com.example.assignment3.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;

    @OneToMany
    @JoinColumn(name="customer_id")
    private customer customer;

    private Date order_date;

    private double total;

    private int order_status_id;
}
