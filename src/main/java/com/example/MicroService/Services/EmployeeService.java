package com.example.MicroService.Services;

import com.example.MicroService.Entity.Employee;
import com.example.MicroService.Repository.EmployeeRepo;

import com.example.MicroService.Responses.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeResponse getEmployeeById(int id){
        Employee employee=employeeRepo.findById(id).get();

//        EmployeeResponse employeeResponse=new EmployeeResponse();
//        employeeResponse.setId(employee.getId());
//        employeeResponse.setName(employee.getName());
//        employeeResponse.setEmail(employee.getEmail());
//        employeeResponse.setBloodgroup(employee.getBloodgroup());
        return modelMapper.map(employee,EmployeeResponse.class);


    }
}
