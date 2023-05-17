package com.mycompany.heranca.agregacao.produtora;

/**
 *
 * @author luifiller
 */
public class TesteProdutora {

    public static void main(String[] args) {
        Produtora produtora = new Produtora("BRQ", 10);

        Ator ator01 = new Ator("Luiz", 60, 25.0);
        Protagonista ator02 = new Protagonista(40,
                35.0, "David", 60, 25.0);
        Protagonista ator03 = new Protagonista(45,
                35.0, "V", 62, 25.0);

        produtora.contratar(ator01);
        produtora.contratar(ator02);
        produtora.contratar(ator03);

        System.out.println("-".repeat(40));

        System.out.println(String.format("Dados do dev. Luiz: %s",
                produtora.buscarAtorPorNome("Luiz")));

        System.out.println("-".repeat(40));

        System.out.println(String.format("Existe o desenvolvedor? : %s",
                produtora.existePorNome("Pereira")));

        System.out.println("-".repeat(40));

        System.out.println(String.format("Quantidade de devs: %d",
                produtora.getQuantidadeDesenvolvedores()));

        System.out.println("-".repeat(40));

        System.out.println(String.format("Quantidade de devs mobile: %d",
                produtora.getQuantidadeDesenvolvedoresMobile()));

        System.out.println("-".repeat(40));

        System.out.println(String.format("Total dos salários: R$%.2f",
                produtora.getTotalSalarios()));

        System.out.println(produtora);

        System.out.println("-".repeat(40));
    }
}
