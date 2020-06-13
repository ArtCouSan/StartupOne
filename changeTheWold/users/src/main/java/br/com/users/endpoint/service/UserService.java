package br.com.users.endpoint.service;

import br.com.users.endpoint.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> findAll();
    UserDTO findById(String id);
    UserDTO save(UserDTO userDTO);
    UserDTO update(String id, UserDTO userDTO);
    void delete(String id);

}
