package com.project.med.Repository;

import org.springframework.data.repository.CrudRepository;

import com.project.med.Entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
