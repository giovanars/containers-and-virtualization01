package br.com.containerandvirtualization.repositories;

import br.com.containerandvirtualization.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
