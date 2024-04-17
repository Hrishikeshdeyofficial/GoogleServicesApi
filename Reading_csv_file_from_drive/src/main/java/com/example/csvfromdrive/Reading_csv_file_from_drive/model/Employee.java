package com.example.csvfromdrive.Reading_csv_file_from_drive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private String id;
	private String name;
	private long phone;
	private String email;
	private String password;
	private long salary;

}
