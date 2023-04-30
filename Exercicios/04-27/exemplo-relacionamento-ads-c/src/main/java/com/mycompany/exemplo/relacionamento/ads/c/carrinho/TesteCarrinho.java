package com.mycompany.exemplo.relacionamento.ads.c.carrinho;

/**
 *
 * @author luifiller
 */
public class TesteCarrinho {

    public static void main(String[] args) {
        Produto produto01 = new Produto("Notebook", "Eletrônicos", 2_700.00);
        Produto produto02 = new Produto("Celular", "Eletrônicos", 1_900.00);
        Produto produto03 = new Produto("Livro", "Papelaria", 50.00);

        Carrinho carrinho01 = new Carrinho("Luiz");
        Carrinho carrinho02 = new Carrinho("Giu");

        carrinho01.adicionar(produto01);
        carrinho01.adicionar(produto02);
        carrinho01.adicionar(produto03);

        carrinho02.adicionar(produto02);

        System.out.println("-------------------------------------------------------------");

        System.out.println(carrinho01.getQuantiddade());
        System.out.println(carrinho02.getQuantiddade());

        System.out.println("-------------------------------------------------------------");

        System.out.println(String.format("Celular existe? : %s",
                carrinho01.existsPorNome("Celular")));

        carrinho01.removerPorNome("Celular");
        System.out.println("-------------------------------------------------------------");

        System.out.println(carrinho01);

        System.out.println("-------------------------------------------------------------");
        System.out.println(carrinho01.getValorTotal());
        System.out.println(carrinho02.getValorTotal());

    }
}
