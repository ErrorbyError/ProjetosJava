package org.example.strategy;

public class ComportamentoAgressivo implements Compportamento{
    @Override
    public void mover() {
        System.out.println("robo está se movendo-se agressivamente...");
    }

}
