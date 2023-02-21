package com.mycompany.nivelamento.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class CalculoRenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantidade de filhos de 0 a 3 anos que você possui: ");
        Integer qtdBebe = leitor.nextInt();
        
        System.out.println("Quantidade de filhos de 4 a 16 anos que você possui: ");
        Integer qtdCrianca = leitor.nextInt();
        
        System.out.println("Quantidade de filhos de 17 a 18 anos que você possui: ");
        Integer qtdAdolescente = leitor.nextInt();
        
        Integer totFilho = qtdBebe + qtdCrianca + qtdAdolescente;
        
        Double totBolsaBebe = qtdBebe * 25.12;
        Double totBolsaCrianca = qtdCrianca * 15.88;
        Double totBolsaAdolescente = qtdAdolescente * 12.44;
        
        Double totBolsaUser = totBolsaBebe + totBolsaCrianca + totBolsaAdolescente;
        
        System.out.println("Você tem um total de "
                + totFilho + " filhos e vai receber R$"
                + totBolsaUser + " de bolsa."
        );
        
    }
}
