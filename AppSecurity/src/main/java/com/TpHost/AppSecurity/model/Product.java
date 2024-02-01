package com.TpHost.AppSecurity.model;


import com.TpHost.AppSecurity.DTO.RequestProductDTO;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(of = "id")
@Table(name = "product_table")
@Entity(name = "product_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer price;
    private Boolean active;


    public Product(RequestProductDTO requestProductDTO) {
        this.name = requestProductDTO.name();
        this.price = requestProductDTO.price();
        this.active= true;
    }
}
