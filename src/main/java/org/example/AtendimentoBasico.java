package org.example;

public class AtendimentoBasico implements Atendimento {

    @Override
    public String realizar() {
        return "Atendimento hospitalar realizado";
    }
}