package org.example.facade;

import org.example.cepApi.CepApi;
import org.example.crmService.CrmService;

public class Facade {


    public Facade() {
    }

    public void migrarCliente(String nome, String cep){
       String cidade =  CepApi.getInstance().recuperarcidade(cep);
       String estado =  CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);






    }


}
