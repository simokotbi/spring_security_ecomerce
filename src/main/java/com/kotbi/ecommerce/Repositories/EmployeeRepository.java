package com.kotbi.ecommerce.Repositories;

import com.kotbi.ecommerce.Entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
