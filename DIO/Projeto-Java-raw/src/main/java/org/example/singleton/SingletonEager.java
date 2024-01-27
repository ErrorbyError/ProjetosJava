package org.example.singleton;


//singleton apressado
//aqui ele já automaticamente cria a instancia, deixando ela pronta pra uso.

public class SingletonEager {
        private static SingletonEager instacia = instacia = new SingletonEager();

//    pos um singleton no mdo lazy, faz com que a sua clase seja instanciada apenas uma unica vez.
//    por isso tem que ser privado para ninguem instanciar.
    private SingletonEager() {
        super();
    }

//    agora vamos criar um métdo publico que explicite isso.

    public static SingletonEager getInstance(){
        return instacia;
    }

}