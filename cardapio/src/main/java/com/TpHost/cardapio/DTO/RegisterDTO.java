package com.TpHost.cardapio.DTO;

import com.TpHost.cardapio.model.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
