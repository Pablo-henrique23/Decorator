package org.example;

public class AtendimentoAcompanhamento extends AtendimentoDecorator {

    public AtendimentoAcompanhamento(Atendimento atendimento) {
        super(atendimento);
    }

    @Override
    public String realizar() {
        return super.realizar() + " + acompanhamento médico";
    }
}