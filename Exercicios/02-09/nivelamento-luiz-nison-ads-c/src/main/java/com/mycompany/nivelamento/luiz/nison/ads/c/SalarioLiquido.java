package com.mycompany.nivelamento.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o salário bruto (apenas número): ");
        Double salarioBruto = leitor.nextDouble();
        
        Double salarioDescontadoInssIr = salarioBruto * 0.7;
        
        System.out.println("Digite o valor  da condução diária só de ida"
                + "ao trabalho: ");
        Double conducaoDiariaIda = leitor.nextDouble();
        
        Double descontoVt = conducaoDiariaIda * 2 * 22;
        
        Double salarioFinal = salarioDescontadoInssIr - descontoVt;
        
        System.out.println("Seu salário bruto é R$"
                + salarioBruto + ", tem um total de R$"
                + ((salarioBruto * 0.3) + descontoVt)
                + " em descontos e receberá um líquido de R$"
                + salarioFinal + "."
        );
    }
}
