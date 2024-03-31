package com.example.authenserver.controller;

import com.example.authenserver.dto.UserDTO;
import com.example.authenserver.dto.UserDTOList;
import com.example.authenserver.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/list")
    public UserDTOList getUsers(){
        return new UserDTOList(userService.getUsers());
    }
}
