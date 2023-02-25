package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class TesteCalculoNutricao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoNutricao calcNutricao = new CalculoNutricao();

        System.out.println("Bem-vindo ao sistema de calculo de IMC. \n"
                + "Insira a quantidade de pessoas que deseja calcular o IMC: \n");
        Integer quantidadePessoa = leitor.nextInt();

        for (int i = 1; i <= quantidadePessoa; i++) {
            System.out.println(String.format("Digite o peso da %dª "
                    + "pessoa: \n", i));
            Double pesoDigitado = leitor.nextDouble();

            System.out.println(String.format("Digite a altura da %dª "
                    + "pessoa: \n", i));
            Double alturaDigitada = leitor.nextDouble();

            calcNutricao.calculaIMC(pesoDigitado, alturaDigitada);
        }
    }
}
