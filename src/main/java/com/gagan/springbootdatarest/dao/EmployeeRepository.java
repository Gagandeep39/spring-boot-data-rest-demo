package com.gagan.springbootdatarest.dao;

import com.gagan.springbootdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @author Gagandeep
 * @date 14-04-2020
 * @time 20:16
 * This interface wil act as a repository
 * It will also act as a mapping endpoint for rest services
 * List of All endpoints can be checked using Spring Boot Actuator
 * http://localhost:8080/spring-crud/gagan/employeee
 */

@RepositoryRestResource(path="employeee")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
