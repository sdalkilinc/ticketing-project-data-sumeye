package com.cydeo.repository;

import com.cydeo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository //Even you don't repository, Springboot will put it behind the scene

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByDescription(String description);

}
