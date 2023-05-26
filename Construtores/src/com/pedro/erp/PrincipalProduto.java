package com.pedro.erp;
import com.pedro.erp.comercial.Pedido;
import com.pedro.erp.estoque.Produto;


public class PrincipalProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Mouse erotico");
        Produto produto3 = new Produto("MacBook Air M1", 110);

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);
        System.out.println(produto1.codigo);

        System.out.println("------------");

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);
        System.out.println(produto2.codigo);

        System.out.println("------------");

        System.out.println(produto3.nome);
        System.out.println(produto3.quantidadeEstoque);
        System.out.println(produto3.codigo);
    }
}
