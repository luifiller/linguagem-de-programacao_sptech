package com.mycompany.correcao.rh.colaborador;

import java.util.Scanner;

/**
 *
 * @author luifiller
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do colaborador 01:");
        String nomeColab01 = leitor.nextLine();
        
        Colaborador colab01 = new Colaborador(nomeColab01, "Analista de Sistemas Júnior", 2000.00);

        Colaborador colab02 = new Colaborador("Geraldina", "DBA Pleno", 2500.00);

        Colaborador colab03 = new Colaborador("Luiz", "Estagiário");

        RecursosHumanos rh = new RecursosHumanos();

        System.out.println(colab01);
        System.out.println(colab02);
        System.out.println(colab03);

        rh.promoverColaborador(colab01, "Analista de Sistamas Pleno", 3500.00);
        rh.promoverColaborador(colab02, "DBA Sênior", 5500.00);

        rh.reajustarSalario(colab01, 150.00);
        
        System.out.println(rh);
    }
}
