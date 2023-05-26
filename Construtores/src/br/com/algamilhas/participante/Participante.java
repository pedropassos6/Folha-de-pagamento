package br.com.algamilhas.participante;

import java.util.Objects;

public class Participante {

    static final int SALDO_INICIAL = 10;

    public String nome;
    public int saldoDePontos;

    public Participante(){
        this("sem nome");
    }

    public Participante(String nome){
        this(nome, SALDO_INICIAL);

    }

    public Participante(String nome, int saldoDePontos){
        Objects.requireNonNull(nome, "Nome é obrigatorio");

        if(saldoDePontos < 0){
            throw new IllegalArgumentException("saldo não pode ser negativo");
        }

        this.nome = nome;
        this.saldoDePontos = creditarPontos(saldoDePontos);

    }

    private int creditarPontos(int pontos){
        return this.saldoDePontos += pontos;
    }
}
