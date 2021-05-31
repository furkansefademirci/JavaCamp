package com.fsd.hrms.dataAccess.abstracts;

import com.fsd.hrms.entities.concretes.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<Users,Integer> {
    List<Users> findUsersByEmail(String email);
}
