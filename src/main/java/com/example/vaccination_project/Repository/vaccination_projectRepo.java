package com.example.vaccination_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vaccination_project.Model.User;

public interface vaccination_projectRepo extends JpaRepository<User, Integer>{
    
}
