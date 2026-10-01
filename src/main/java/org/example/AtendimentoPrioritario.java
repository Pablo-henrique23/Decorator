package org.example;

public class AtendimentoPrioritario extends AtendimentoDecorator {

    public AtendimentoPrioritario(Atendimento atendimento) {
        super(atendimento);
    }

    @Override
    public String realizar() {
        return super.realizar() + " + prioridade";
    }
}