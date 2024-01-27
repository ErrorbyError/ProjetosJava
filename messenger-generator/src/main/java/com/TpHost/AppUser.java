package com.TpHost;

import com.TpHost.model.Users;
import com.TpHost.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppUser implements CommandLineRunner {
   @Autowired
    Repository repository;


    @Override
    public void run(String... args) throws Exception {
            Users users = new Users();

            users.setPassword("3412312");
            users.setName("CaioPedro");
            users.setLast_name("balbla");

            repository.save(users);



    }
}
