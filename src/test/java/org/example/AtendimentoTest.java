package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtendimentoTest {

    @Test
    public void deveRealizarAtendimentoBasico() {

        Atendimento atendimento = new AtendimentoBasico();

        assertEquals("Atendimento hospitalar realizado", atendimento.realizar());
    }

    @Test
    public void deveAdicionarPrioridade() {

        Atendimento atendimento = new AtendimentoBasico();

        atendimento = new AtendimentoPrioritario(atendimento);

        assertEquals("Atendimento hospitalar realizado + prioridade", atendimento.realizar());
    }

    @Test
    public void deveAdicionarAtendimentoParticular() {

        Atendimento atendimento = new AtendimentoBasico();

        atendimento = new AtendimentoParticular(atendimento);

        assertEquals("Atendimento hospitalar realizado + atendimento particular", atendimento.realizar());
    }

    @Test
    public void deveAdicionarAcompanhamento() {

        Atendimento atendimento = new AtendimentoBasico();

        atendimento = new AtendimentoAcompanhamento(atendimento);

        assertEquals("Atendimento hospitalar realizado + acompanhamento médico", atendimento.realizar());
    }

    @Test
    public void deveCombinarDecorators() {

        Atendimento atendimento = new AtendimentoBasico();

        atendimento = new AtendimentoPrioritario(atendimento);

        atendimento = new AtendimentoParticular(atendimento);

        atendimento = new AtendimentoAcompanhamento(atendimento);

        assertEquals("Atendimento hospitalar realizado + prioridade + atendimento particular + acompanhamento médico", atendimento.realizar());
    }
}