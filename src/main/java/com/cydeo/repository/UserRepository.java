package com.cydeo.repository;

import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByIsDeletedOrderByFirstNameDesc(Boolean deleted);
    User findByUserNameAndIsDeleted(String username, Boolean deleted);
    @Transactional
    //Spring says when you write a query in the repository, if this query does insert, delete or update
    //we need to annotate it with @Transactional
    void deleteByUserName(String username);

    List<User> findByRoleDescriptionIgnoreCaseAndIsDeleted(String description, Boolean deleted);



}
