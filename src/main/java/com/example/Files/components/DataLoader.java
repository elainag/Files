package com.example.Files.components;

import com.example.Files.models.Files;
import com.example.Files.models.Folder;
import com.example.Files.models.User;
import com.example.Files.repositories.FilesRepository;
import com.example.Files.repositories.FolderRepository;
import com.example.Files.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FilesRepository filesRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{

        Files files1 = new Files("word", "docx", 17);
        filesRepository.save(files1);
        Files files2 = new Files("pdf", "pdf", 27);
        filesRepository.save(files2);
        Files files3 = new Files("excel", "xlsx", 7);
        filesRepository.save(files3);
        Files files4 = new Files("audio", "mp4", 177);
        filesRepository.save(files4);

        Folder folder1 = new Folder("Folder1");
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Folder2");
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Folder3");
        folderRepository.save(folder3);

        User user1 = new User("Bob");
        userRepository.save(user1);
        User user2 = new User("Bill");
        userRepository.save(user2);
        User user3 = new User("Brad");
        userRepository.save(user3);




    }
}
