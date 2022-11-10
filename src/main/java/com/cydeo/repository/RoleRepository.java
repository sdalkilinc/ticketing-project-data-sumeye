package com.cydeo.repository;

import com.cydeo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByDescription(String description);

}
