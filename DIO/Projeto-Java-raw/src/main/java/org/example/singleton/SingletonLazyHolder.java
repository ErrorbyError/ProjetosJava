package org.example.singleton;


//singleton lazyHolder
// a diferença aqui é apenas no encapsulamento da nossa instancia

public class SingletonLazyHolder {

        private static class Holder {
        public static SingletonLazyHolder instacia =  new SingletonLazyHolder();
        }

//    pos um singleton no mdo lazy, faz com que a sua clase seja instanciada apenas uma unica vez.
//    por isso tem que ser privado para ninguem instanciar.
    private SingletonLazyHolder() {
        super();
    }

//    agora vamos criar um métdo publico que explicite isso.

    public static SingletonLazyHolder getInstance(){
        return Holder.instacia;
    }

}