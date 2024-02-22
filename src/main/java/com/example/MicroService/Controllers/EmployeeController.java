package com.example.MicroService.Controllers;


import com.example.MicroService.Entity.Employee;
import com.example.MicroService.Responses.EmployeeResponse;
import com.example.MicroService.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee/{id}")
    ResponseEntity<EmployeeResponse> getEmployeeDetail(@PathVariable("id")int id) {
//db call->employee1
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(
                employeeService.getEmployeeById(id));
    }

    }

