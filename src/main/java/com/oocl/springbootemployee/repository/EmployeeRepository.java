package com.oocl.springbootemployee.repository;

import com.oocl.springbootemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> getAll();
}
