package com.example.authenserver.service;

import com.example.authenserver.dto.UserDTO;
import com.example.authenserver.repo.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Override
    @Transactional(readOnly = true)
    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream().map(
                userEntity -> UserDTO.builder()
                        .id(userEntity.getId())
                        .username(userEntity.getUsername())
                        .build()
        ).collect(Collectors.toList());
    }
}
