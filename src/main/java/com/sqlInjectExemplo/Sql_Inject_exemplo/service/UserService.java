package com.sqlInjectExemplo.Sql_Inject_exemplo.service;

import com.sqlInjectExemplo.Sql_Inject_exemplo.entity.AppUser;
import com.sqlInjectExemplo.Sql_Inject_exemplo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserRepository userRepository;

    public List<Map<String, Object>> buscarUsuarioVulneravel(String username) {
        String sql = "SELECT * FROM users WHERE username = '" + username + "'";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> buscarUsuarioSeguro(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        return jdbcTemplate.queryForList(sql, username);
    }

    public List<AppUser> buscarUsuarioComJpa(String username) {
        return userRepository.findByUsername(username);
    }
}