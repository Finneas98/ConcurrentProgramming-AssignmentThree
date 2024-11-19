package com.example.assignment3.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class order_items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_item_id;

    @ManyToOne
    @JoinColumn(name="order_id")
    private order order;

    @ManyToOne
    @JoinColumn(name="product_id")
    private product product;

    private int quantity;

    private double price;
}
