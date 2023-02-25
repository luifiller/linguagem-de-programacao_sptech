package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class TetseCalculoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        CalculoAluno calc = new CalculoAluno();
        
        System.out.println("Digite a 1ª nota: ");
        Double nota01 = leitor.nextDouble();
        
        System.out.println("Digite a 2ª nota: ");
        Double nota02 = leitor.nextDouble();
        
        Double mediaNotas = calc.calcularMedia(nota01, nota02);
        
        System.out.println(String.format("Sua média é: %.2f", mediaNotas));
    }
}
