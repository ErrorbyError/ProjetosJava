package com.TpHost.cardapio.model;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(of = "id") // aqui é só pra indicar que o id é a representação unica da tabela.
@Getter  // usado o @getter aqui, ele faz com que todos valores terão um metodo get.
@NoArgsConstructor // usamos esse aqui para criar um constructor sem argumentos.
@AllArgsConstructor // e aqui criamos um constructor que recebe todos os argumentos.
@Entity(name = "tb-foods")
@Table(name = "tb-foods", schema = "public")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_food")
    private Long id;


    @Column(length = 50, nullable = false)
    @Setter
    private String title;


    @Column(length = 50, nullable = false)
    @Setter
    private String image;


    @Column(length = 50, nullable = false)
    @Setter
    private Integer price;


    public Food(foodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();


    }

}
