package com.demo.practice.service;


import com.demo.practice.DTO.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    public EmployeeDto add(EmployeeDto employeeDto);
    public void deleteEmployee(long id);
   // public EmployeeDto findByEmployeeId(long id);
    // public EmployeeDto getAllEmployees();
    public void updateEmployee(EmployeeDto employeeDto);
    //public EmployeeResponseDto getAllEmployee(int pageNo, int pageSize, String sortBy, String sortByDir);
}


