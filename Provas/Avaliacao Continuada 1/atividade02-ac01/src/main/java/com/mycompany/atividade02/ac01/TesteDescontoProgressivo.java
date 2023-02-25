package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class TesteDescontoProgressivo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo descontoMetodo = new DescontoProgressivo();

        System.out.println("Bem-vindo ao sistema de desconto progressivo! \n"
                + "Digite o valor unitário do produto: \n");
        Double valorProduto = leitor.nextDouble();

        System.out.println("Digite a quantidade: \n");
        Integer quantidadeProduto = leitor.nextInt();

        descontoMetodo.exibirNotaFiscal(valorProduto, quantidadeProduto);
        
    }
}
