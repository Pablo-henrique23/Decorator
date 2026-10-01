package org.example;

public class AtendimentoParticular extends AtendimentoDecorator {

    public AtendimentoParticular(Atendimento atendimento) {
        super(atendimento);
    }

    @Override
    public String realizar() {
        return super.realizar() + " + atendimento particular";
    }
}