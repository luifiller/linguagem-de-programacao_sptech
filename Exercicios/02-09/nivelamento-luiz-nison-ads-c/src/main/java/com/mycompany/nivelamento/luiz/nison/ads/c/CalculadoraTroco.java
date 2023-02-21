package com.mycompany.nivelamento.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor unitário do produto: ");
        Double valorUnitarioProduto = leitor.nextDouble();
        
        System.out.println("Digite a quantidade vendida: ");
        Integer qtdVendida = leitor.nextInt();
        
        System.out.println("Digite o valor pago pelo cliente: ");
        Integer valorPago = leitor.nextInt();
        
        Double totFinal = valorUnitarioProduto * qtdVendida;
        Double troco = valorPago - totFinal;
        
        System.out.println("Seu troco será de R$"
                + troco + ".");
    }
}
