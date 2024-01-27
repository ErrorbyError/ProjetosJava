package org.example.strategy;

public class Robo {
    private Compportamento compportamento;

    public void setCompportamento(Compportamento compportamento) {
        this.compportamento = compportamento;
    }

    public void mover(){
        compportamento.mover();
    }
}
