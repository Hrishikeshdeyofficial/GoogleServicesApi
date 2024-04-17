package com.example.csvfromdrive.Reading_csv_file_from_drive.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.csvfromdrive.Reading_csv_file_from_drive.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
