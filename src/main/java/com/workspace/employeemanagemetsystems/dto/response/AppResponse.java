package com.workspace.employeemanagemetsystems.dto.response;


import com.workspace.employeemanagemetsystems.dto.EmployeePayload;
import lombok.Data;

import java.util.List;

/**
 * Response DTO for the service
 */
@Data
public class AppResponse {

    private List<EmployeePayload> employees;

}
