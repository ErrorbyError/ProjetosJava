package org.example.singleton;


//singleton preguiçoso

public class SingletonLazy {
        private static SingletonLazy instacia;

//    pos um singleton no mdo lazy, faz com que a sua clase seja instanciada apenas uma unica vez.
//    por isso tem que ser privado para ninguem instanciar.
    private SingletonLazy() {
        super();
    }

//    agora vamos criar um métdo publico que explicite isso.

    public static SingletonLazy getInstance(){
        if (instacia == null){
            instacia = new SingletonLazy();

        }
        return instacia;
    }

}