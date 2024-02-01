package com.TpHost.cardapio.controller;

import com.TpHost.cardapio.DTO.UsersResponseDTO;
import com.TpHost.cardapio.DTO.UsersResquestDTO;
import com.TpHost.cardapio.model.Users;
import com.TpHost.cardapio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserControler {
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<UsersResponseDTO> getAllUsers(){

        List<UsersResponseDTO> usersResponseDTOList = userRepository.findAll().stream().map(UsersResponseDTO::new).toList();

        return usersResponseDTOList;

    }


    @PostMapping
    public void saveUsers(@RequestBody  UsersResquestDTO data){
        Users users = new Users(data);
        userRepository.save(users);
    }


}
