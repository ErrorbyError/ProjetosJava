package com.TpHost.cardapio.repository;

import com.TpHost.cardapio.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<Users, Long> {
//    quando declaramos um metodo com uma nomeclatura padrão, o JPA automaticamente entende o que queremos, por exemplo:
//    vamos criar um metodo para pegar o login.
    UserDetails findByLogin(String login);

    
}
