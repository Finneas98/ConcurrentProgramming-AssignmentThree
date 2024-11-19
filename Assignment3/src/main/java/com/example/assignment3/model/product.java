package com.example.assignment3.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long product_id;

    private String name;

    private String description;

    private double price;

    @OneToMany
    @JoinColumn(name="category_id")
    private List<category> categories;

    private String image;
}
