package com.workspace.employeemanagemetsystems.dto.mapper;


import com.workspace.employeemanagemetsystems.dto.EmployeePayload;
import com.workspace.employeemanagemetsystems.model.Employee;

/**
 * Extend the capabilities of the EntityMapper for mapping
 * DTOs to Entities and from Entities to DTOs
 */
public interface EmployeeMapper extends  EntityMapper<EmployeePayload, Employee>{
}
