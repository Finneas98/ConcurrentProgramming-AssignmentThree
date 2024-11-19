package com.example.assignment3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int category_id;

    private String name;
}
