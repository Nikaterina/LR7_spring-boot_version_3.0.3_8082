package com.example.lr7.repository;

import com.example.lr7.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lr7.entity.Student;
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
