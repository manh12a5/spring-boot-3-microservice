package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee add(@RequestBody Employee employee) {
        LOGGER.info("Add department: {}", employee);
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id) {
        LOGGER.info("Find by id: {}", id);
        return employeeService.findById(id);
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartmentId(@PathVariable Long departmentId) {
        LOGGER.info("Find by departmentId: {}", departmentId);
        return employeeService.findByDepartmentId(departmentId);
    }

    @GetMapping
    public List<Employee> findAll() {
        LOGGER.info("Find all employee");
        return employeeService.findAll();
    }

}
