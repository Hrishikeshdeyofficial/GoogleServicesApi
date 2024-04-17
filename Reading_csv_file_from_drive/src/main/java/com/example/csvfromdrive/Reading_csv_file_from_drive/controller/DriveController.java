package com.example.csvfromdrive.Reading_csv_file_from_drive.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.csvfromdrive.Reading_csv_file_from_drive.service.DriveQuickStart;
import com.google.api.services.drive.model.File;

@RestController
public class DriveController {

	@Autowired
	private DriveQuickStart service;

	@GetMapping("/")
	public List<File> getAllFiles() throws IOException, GeneralSecurityException {
		return service.getAllfiles();
	}

	@PostMapping("/post")
	public String uploadFiles(MultipartFile file) throws IOException, GeneralSecurityException {
		System.out.println(file.getOriginalFilename());

		return service.uploadFile(file);
	}

	@GetMapping("/id")
	public File getFileByFileId(@RequestParam String fileID) throws IOException, GeneralSecurityException {
		return service.getFileById(fileID);
	}

	@GetMapping("/name/{fileName}")
	public String getFileByFileName(@PathVariable String fileName) throws IOException, GeneralSecurityException {
		return service.findFileIDByName(fileName);

	}

	@PostMapping("/save")
	public String saveEmployee(@RequestParam String fileId) throws IOException, GeneralSecurityException {

		return service.saveEmployee(fileId);
	}
}