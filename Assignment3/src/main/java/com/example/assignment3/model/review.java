package com.example.assignment3.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int review_id;

    @ManyToOne
    @JoinColumn(name="product_id")
    private product product;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private customer customer;

    private int rating;

    private String comment;
}
