package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private List<String> usuarios = new ArrayList<>();

    @GetMapping
    public List<String> listar() {
        return usuarios;
    }

    @PostMapping
    public String adicionar(@RequestBody String nome) {
        usuarios.add(nome);
        return "Usuário adicionado";
    }
}