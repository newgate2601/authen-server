package com.example.authenserver.service;

import com.example.authenserver.dto.UserDTO;
import com.example.authenserver.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserDTO> getUsers();
}
