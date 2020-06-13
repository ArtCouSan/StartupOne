package br.com.users.endpoint.service.impl;

import br.com.users.endpoint.dto.UserDTO;
import br.com.users.endpoint.entity.User;
import br.com.users.endpoint.repository.UserRepository;
import br.com.users.endpoint.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
    }

    @Override
    public UserDTO findById(String id) {
        return new UserDTO(userRepository.findById(id).get());
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        return new UserDTO(userRepository.save(new User(userDTO)));
    }

    @Override
    public UserDTO update(String id, UserDTO userDTO) {
        User user = userRepository.findById(id).get();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setDateBirth(userDTO.getDateBirth());
        user.setGenre(userDTO.getGenre());
        user.setGenre(userDTO.getPhoneNumber());

        return new UserDTO(userRepository.save(user));
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);

    }
}
