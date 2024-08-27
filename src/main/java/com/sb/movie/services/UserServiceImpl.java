package com.sb.movie.services;

import com.sb.movie.converter.UserConvertor;
import com.sb.movie.entities.User;
import com.sb.movie.exceptions.UserExist;
import com.sb.movie.repositories.UserRepository;
import com.sb.movie.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

      
    @Override
    public String addUser(UserRequest userRequest) {
        Optional<User> users = userRepository.findByEmailId(userRequest.getEmailId());

        if (users.isPresent()) {
            throw new UserExist();
        }

        User user = UserConvertor.userDtoToUser(userRequest,  passwordEncoder.encode("1234"));

        userRepository.save(user);
        return "User Saved Successfully";
    }

}