package com.TpHost.cardapio.model;


// como ele vai ser um dado que chega do cliente, não precisamos colocar o id pq o id é responsavel do servidor.
public record foodRequestDTO(String title, String image, Integer price) {

    public foodRequestDTO(String title, String image, Integer price) {
        this.title = title;
        this.image = image;
        this.price = price;
    }
}
