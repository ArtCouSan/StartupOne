package br.com.posts.endpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/post")
public class PostsController {

    // TODO: Remover
    @GetMapping()
    public String hello(){
        return "Teste";
    }

}
