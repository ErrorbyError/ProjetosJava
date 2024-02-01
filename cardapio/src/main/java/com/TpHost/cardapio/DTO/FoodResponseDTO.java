package com.TpHost.cardapio.DTO;

import com.TpHost.cardapio.model.Food;

// ao inves de usar uma classe, usaremos o "record" que será usado nas respostas e nas request da aplicação.
// pois como não iremos usar um get ou set, pois ele só vai representar os dados.
public record FoodResponseDTO(Long id, String title, String image, Integer price){

    public FoodResponseDTO(Food food){
//        como o id é uma entidade que está sendo representada no banco de dados, temos que usar o loogbook.

        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }



}
