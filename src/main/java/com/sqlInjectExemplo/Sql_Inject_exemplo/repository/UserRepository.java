package com.sqlInjectExemplo.Sql_Inject_exemplo.repository;

import com.sqlInjectExemplo.Sql_Inject_exemplo.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    List<AppUser> findByUsername(String username);
}
