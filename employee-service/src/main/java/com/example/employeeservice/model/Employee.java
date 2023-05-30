package com.example.employeeservice.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    private Long id;
    private Long departmentId;
    private String name;
    private int age;
    private String position;

}
