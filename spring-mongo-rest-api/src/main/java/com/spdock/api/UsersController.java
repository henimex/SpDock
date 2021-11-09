package com.spdock.api;

import com.spdock.entites.User;
import com.spdock.dataAccess.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

/*   @PostConstruct
    public void init(){
        User user = new User();
        user.setName("Jospeh");
        user.setSurname("HenimeX");
        userRepository.save(user);
    }
*/

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll(User user) {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
