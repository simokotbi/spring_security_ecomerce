package com.kotbi.ecommerce.Repositories;

import com.kotbi.ecommerce.Entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
