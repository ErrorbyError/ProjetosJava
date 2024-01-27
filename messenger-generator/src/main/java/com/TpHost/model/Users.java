package com.TpHost.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tb-users", schema = "public")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_id")
    private Integer id;

    @Getter
    @Setter
    @Column(length = 50, nullable = false)
    private String name;

    @Getter
    @Setter
    @Column(length = 20, nullable = false)
    private String last_name;

    @Getter
    @Setter
    @Column(length = 100, nullable = false)
    private String password;


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + last_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
