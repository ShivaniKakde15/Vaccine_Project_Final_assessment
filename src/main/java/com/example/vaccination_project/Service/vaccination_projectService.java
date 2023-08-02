package com.example.vaccination_project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vaccination_project.Model.User;
import com.example.vaccination_project.Repository.vaccination_projectRepo;

@Service
public class vaccination_projectService {
    @Autowired
    vaccination_projectRepo repo;

    public void Add(User use) {
        repo.save(use);
    }
    public List<User> show() {
        return repo.findAll();
    }

    public void Delete(Integer id) {
        repo.deleteById(id);
    }

    public User update(Integer id) {
        Optional<User> table = repo.findById(id);
        if (table.isPresent()) {
            return table.get();
        } else {
            return null;
        }
    }
}
