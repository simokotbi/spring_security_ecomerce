package com.kotbi.ecommerce.Repositories;

import com.kotbi.ecommerce.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    //public Optional<Customer>findbyemail(String email);
    Customer findByEmail(String email);
}
