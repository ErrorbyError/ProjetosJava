package com.TpHost.AppSecurity.repository;

import com.TpHost.AppSecurity.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
// se seguimos um padrao o JPA consegue automaticamente criar pra gente toda a logica.
//    o que eu quero? -> findAll
//    qual coluna? : By"coluna" -> ByActive
//  qual valor a ser encontrado? -> true

    List<Product> findAllByActiveTrue();
}
