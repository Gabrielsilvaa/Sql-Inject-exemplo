package com.sqlInjectExemplo.Sql_Inject_exemplo.controller;

import com.sqlInjectExemplo.Sql_Inject_exemplo.entity.AppUser;
import com.sqlInjectExemplo.Sql_Inject_exemplo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    private UserService userService;

    @GetMapping("/buscar")
    public List<AppUser> buscar(@RequestParam String username) {
        return userService.buscarUsuarioComJpa(username);
    }
}
