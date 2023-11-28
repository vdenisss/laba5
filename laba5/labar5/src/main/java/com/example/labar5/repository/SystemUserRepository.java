package com.example.labar5.repository;

import com.example.labar5.model.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserRepository extends JpaRepository<SystemUser, Integer> {
}
