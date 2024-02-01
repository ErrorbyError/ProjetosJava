package com.TpHost.cardapio.model;


import com.TpHost.cardapio.DTO.UsersResquestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.List;


@EqualsAndHashCode(of = "id")
@Getter
@Table(name = "users" , schema = "public")
@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class Users implements  UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String login;
    private String password;
    private UserRole role;


    public Users(String login, String password, UserRole role) {
        this.login = login;
        this.password = password;
        this.role = role;

    }

    public Users(UsersResquestDTO data) {
        this.login = data.login();
        this.name = data.name();
        this.password = data.password();
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.role == UserRole.ADMIN){
            return  List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));

        }else {
            return  List.of(new SimpleGrantedAuthority("ROLE_USER"));
        }
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return  true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
