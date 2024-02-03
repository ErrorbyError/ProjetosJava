package com.TpHost.AppSecurity.DTO;

import com.TpHost.AppSecurity.model.UserRole;

public record RequesterDTO(String login, String password, UserRole role) {

}
