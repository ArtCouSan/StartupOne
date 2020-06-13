package br.com.users.endpoint.repository;

import br.com.users.endpoint.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
