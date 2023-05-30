package com.example.departmentservice.repository;

import com.example.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DepartmentRepository {

    private List<Department> departmentList = new ArrayList<>();

    public Department addDepartment(Department department) {
        departmentList.add(department);
        return department;
    }

    public Department findById(Long id) {
        return departmentList.stream()
                .filter(department -> department.getId().equals(id)).findFirst()
                .orElse(null);
    }

    public List<Department> findAll() {
        return departmentList;
    }


}
