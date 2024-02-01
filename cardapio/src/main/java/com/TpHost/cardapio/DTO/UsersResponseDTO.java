package com.TpHost.cardapio.DTO;


import com.TpHost.cardapio.model.Users;

public record UsersResponseDTO(Long id, String name, String login, String password) {

    public UsersResponseDTO(Users users){
        this(users.getId(), users.getName(), users.getLogin(), users.getPassword());

    }


}
