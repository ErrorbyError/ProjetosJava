package com.TpHost.cardapio.controller;


// controller - concentra os request para pegar os dados do cadarpio e adcionar novas informações no banco de dados

import com.TpHost.cardapio.model.Food;
import com.TpHost.cardapio.model.FoodResponseDTO;
import com.TpHost.cardapio.model.foodRequestDTO;
import com.TpHost.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController   // usamos isso para mapear esta classe para ser reconhecida como um controller.
@RequestMapping("food") // estamos dizendo que este controller vai controlar esse endpoint "\food"
public class FoodController {

    @Autowired // usamos o autowired para que ele seja responsável para criar uma instância para nós.
    FoodRepository foodRepository;


    @GetMapping
    // basicamente diz que quando estiverem no endpoint "food" e usarem o metodo GET, este metodo será usado.
    public List<FoodResponseDTO> getAll() {

//        uma boa pratica é usar uma classe DTO -  date transfer object.

//        como estamos retornando um List, mas o dado é um record. precisamos utilizar o Stream junto com o Map
//        o metodo stream vai pegar tudo que está vindo do repositorio atraves do metodo findall().
//        e depois vai por ele dentro de um "funil" e para cada objeto que passar no "funil", vamos criar um DTO.


        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();


        return foodList;

    }


//    usamos o requestbody pq o cliente vai salva no body da nossa palicação, enttão temos que pegar as informações nesse body
//    vamos criar um novo record.
    @PostMapping
    public void saveFood(@RequestBody foodRequestDTO data){
//        aqui o cliente vai enviar  para o body da aplicação.

//        como estamos salvando um dado, e esse dado tem que ser no formato de entidade.
//        no response a gente transformou uma entidade em um DTO
//        aqui iremos fazer o contrário.

//        temos que criar um constructor na classe Food especifico que recebe esse record.
        Food foodData = new Food(data);

        foodRepository.save(foodData);

    }


}
