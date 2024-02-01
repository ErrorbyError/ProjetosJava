package com.TpHost.AppSecurity.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProductDTO(

        String id,

        @NotBlank
        String name,

        @NotNull
        Integer price) {
}
