package com.example.assignment3.repository;

import com.example.assignment3.model.customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerRepository extends CrudRepository<customer,Integer> {

}
