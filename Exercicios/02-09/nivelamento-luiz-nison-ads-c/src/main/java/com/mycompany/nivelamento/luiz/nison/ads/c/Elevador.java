package com.mycompany.nivelamento.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class Elevador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o limite de peso do elevador: ");
        Double limitePesoElevador = leitor.nextDouble();

        System.out.println("Digite o limite de pessoas no elevador: ");
        Integer limitePessoaElevador = leitor.nextInt();

        System.out.println("Digite o peso da 1ª pessoa: ");
        Double peso01Pessoa = leitor.nextDouble();

        System.out.println("Digite o peso da 2ª pessoa: ");
        Double peso02Pessoa = leitor.nextDouble();

        System.out.println("Digite o peso da 3ª pessoa: ");
        Double peso03Pessoa = leitor.nextDouble();
        
        Double totPesoElevador = peso01Pessoa + peso02Pessoa + peso03Pessoa;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "
                + limitePessoaElevador + " pessoas. \n" 
                + "O peso total no elevador é de " 
                + totPesoElevador + ", sendo que ele suporta "
                + limitePesoElevador + "."
        );

    }
}
