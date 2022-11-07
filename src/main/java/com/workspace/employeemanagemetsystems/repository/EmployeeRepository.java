package com.workspace.employeemanagemetsystems.repository;


import com.workspace.employeemanagemetsystems.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByEmployeeId(String id);
    void deleteByEmployeeId(String id);
}
