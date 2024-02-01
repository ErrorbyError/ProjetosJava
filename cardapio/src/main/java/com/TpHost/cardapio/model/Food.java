package com.TpHost.cardapio.model;

import com.TpHost.cardapio.DTO.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(of = "id") // aqui é só pra indicar que o id é a representação unica da tabela.
@Getter  // usado o @getter aqui, ele faz com que todos valores terão um metodo get.
@Setter
@NoArgsConstructor // usamos esse aqui para criar um constructor sem argumentos.
@AllArgsConstructor // e aqui criamos um constructor que recebe todos os argumentos.
@Entity(name = "tb-foods")
@Table(name = "tb-foods", schema = "public")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;


    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();


    }




}
