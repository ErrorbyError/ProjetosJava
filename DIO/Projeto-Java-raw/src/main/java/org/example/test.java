package org.example;

import org.example.facade.Facade;
import org.example.singleton.SingletonEager;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;
import org.example.strategy.*;

public class test {
    public static void main(String[] args) {

//        singleton
//        Testes relacionados ao design pattern singleTon
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        SingletonLazy singletonLaz = SingletonLazy.getInstance();
        System.out.println(singletonLaz);

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        SingletonEager singleEager = SingletonEager.getInstance();
        System.out.println(singleEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        SingletonLazyHolder singletonHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonHolder);

//        Strategy

        Compportamento normal = new ComportamentoNormal();

        Compportamento agressivo = new ComportamentoAgressivo();

        Compportamento defensivo = new ComportamentoDefensivo();


        Robo robo = new Robo();
            robo.setCompportamento(normal);
            robo.mover();

            robo.setCompportamento(agressivo);
            robo.mover();

            robo.setCompportamento(defensivo);
            robo.mover();

            Facade facade = new Facade();

            facade.migrarCliente("Talisson", "57820-000");







    }
}
