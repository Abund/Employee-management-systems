package com.workspace.employeemanagemetsystems.service;


import com.workspace.employeemanagemetsystems.dto.EmployeePayload;
import com.workspace.employeemanagemetsystems.dto.response.AppResponse;

public interface EmployeeService {
    EmployeePayload createEmployee(EmployeePayload request);
    EmployeePayload updateEmployee(EmployeePayload request);
    AppResponse findAll();
    EmployeePayload findOne(String id);
    void delete(String id);
}
