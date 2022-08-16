package com.example.Files.components;

import com.example.Files.models.Files;
import com.example.Files.models.Folder;
import com.example.Files.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    Files files;

    @Autowired
    Folder folder;

    @Autowired
    User user;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{


    }
}
