package org.example.cepApi;



public class CepApi {

    private static CepApi instacia = instacia = new CepApi();

    //    pos um singleton no mdo lazy, faz com que a sua clase seja instanciada apenas uma unica vez.
//    por isso tem que ser privado para ninguem instanciar.
    private CepApi() {
        super();
    }

//    agora vamos criar um métdo publico que explicite isso.

    public static CepApi getInstance(){
        return instacia;
    }


    public String recuperarcidade(String cep){
        return "murici";

    }

    public String recuperarEstado(String cep){
        return "Alagoas";
    }

}
