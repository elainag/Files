package com.example.Files.controllers;

import com.example.Files.models.Files;
import com.example.Files.models.Folder;
import com.example.Files.repositories.FilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FilesController {

    @Autowired
    FilesRepository filesRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<Files>> getAllFiles() {
        return new ResponseEntity<>(filesRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/files/{id}")
    public ResponseEntity<Optional<Files>> getFile(@PathVariable Long id){
        return new ResponseEntity<>(filesRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity<Files> createFile(@RequestBody Files files){
        filesRepository.save(files)
        return new ResponseEntity<>(files, HttpStatus.CREATED);
    }
}
