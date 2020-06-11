package br.com.users.endpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UsersController {

    // TODO: Remover
    @GetMapping()
    public String hello(){
        return "Teste";
    }

}
