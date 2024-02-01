package com.TpHost.cardapio.DTO;


// como ele vai ser um dado que chega do cliente, não precisamos colocar o id pq o id é responsavel do servidor.
public record FoodRequestDTO(Long id, String title, String image, Integer price) {



}
