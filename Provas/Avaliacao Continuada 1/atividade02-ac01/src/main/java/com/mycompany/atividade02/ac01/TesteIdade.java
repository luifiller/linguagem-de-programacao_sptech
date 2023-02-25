package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class TesteIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Idade idadeMetodo = new Idade();
        
        System.out.println("Insira sua idade: ");
        Integer idade = leitor.nextInt();
        
        idadeMetodo.exibirFaixaEtaria(idade);
    }
}
