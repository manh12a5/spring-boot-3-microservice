package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final List<Employee> employeeList = new ArrayList<>();

//    @Autowired
//    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public Employee findById(Long id) {
        return employeeList.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Employee> findByDepartmentId(Long departmentId) {
        return employeeList.stream()
                .filter(employee -> employee.getDepartmentId().equals(departmentId))
                .collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return employeeList;
    }

//    public Employee addEmployee(Employee employee) {
//        employeeRepository.save(employee);
//        return employee;
//    }
//
//    public Employee findById(Long id) {
//        return employeeRepository.findById(id).orElse(null);
//    }
//
//    public List<Employee> findAll() {
//        return employeeRepository.findAll();
//    }

}
