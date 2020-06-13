package br.com.users.endpoint.controller;

import br.com.users.endpoint.dto.UserDTO;
import br.com.users.endpoint.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UsersController {

    private UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> findAll(){
        return userService.findAll();
    }

    @GetMapping("{id}")
    public UserDTO findById(@RequestParam String id){
        return userService.findById(id);
    }

    @PostMapping
    public UserDTO save(@RequestBody UserDTO userDTO){
        return userService.save(userDTO);
    }

    @PutMapping({"id"})
    public UserDTO update(@RequestParam String id, @RequestBody UserDTO userDTO){
        return userService.update(id, userDTO);
    }

    @DeleteMapping({"id"})
    public void delete(@RequestParam String id){
        userService.delete(id);
    }
}
