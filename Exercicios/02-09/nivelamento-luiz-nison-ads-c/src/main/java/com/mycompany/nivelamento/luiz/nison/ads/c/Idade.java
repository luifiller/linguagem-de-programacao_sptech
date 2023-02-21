package com.mycompany.nivelamento.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeUser = leitor.nextLine();
        
        System.out.println("Olá, "
                + nomeUser + "! Qual o ano de seu nascimento?"
        );
        
        Integer anoNascimentoUser = leitor.nextInt();
        
        Integer idadeAno = (2030 - anoNascimentoUser); 
        
        System.out.println("Em 2030 você terá "
                + idadeAno + " anos."
        );
        
    }
}
