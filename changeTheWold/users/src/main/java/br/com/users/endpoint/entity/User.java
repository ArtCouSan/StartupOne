package br.com.users.endpoint.entity;

import br.com.users.endpoint.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "user")
@Getter
@Setter
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime dateBirth;
    private String genre;
    private String phoneNumber;

    public User() {
    }

    public User(UserDTO userDTO) {
        this.firstName = userDTO.getFirstName();
        this.lastName = userDTO.getLastName();
        this.email = userDTO.getEmail();
        this.password = userDTO.getPassword();
        this.dateBirth = userDTO.getDateBirth();
        this.genre = userDTO.getGenre();
        this.phoneNumber = userDTO.getPhoneNumber();
    }
}
