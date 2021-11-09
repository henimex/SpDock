package com.spdock.dataAccess;

import com.spdock.entites.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
