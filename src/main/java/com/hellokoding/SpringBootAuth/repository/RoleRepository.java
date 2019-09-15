package com.hellokoding.SpringBootAuth.repository;

import com.hellokoding.SpringBootAuth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}