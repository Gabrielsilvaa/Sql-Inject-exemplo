package com.sqlInjectExemplo.Sql_Inject_exemplo.controller;

import com.sqlInjectExemplo.Sql_Inject_exemplo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/seguro")
public class SecureController {

    @Autowired
    private UserService userService;

    @GetMapping("/buscar")
    public List<Map<String, Object>> buscar(@RequestParam String username) {
        return userService.buscarUsuarioSeguro(username);
    }
}