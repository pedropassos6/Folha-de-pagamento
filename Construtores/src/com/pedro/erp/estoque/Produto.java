package com.pedro.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    public final String codigo;

    public String nome;
    public int quantidadeEstoque;

    public Produto(){
        this("sem nome");

    }

    public Produto(String nome){
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);

    }

    public Produto(String nome, int estoqueInicial){
        Objects.requireNonNull(nome, "nome é obrigatorio");

        if(estoqueInicial < 0){
            throw new IllegalArgumentException("Estoque inicial não pode ser zero");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = UUID.randomUUID().toString();

    }

}
