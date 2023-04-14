package com.mycompany.ac2.segunda.atividade;

import java.util.Scanner;

/**
 *
 * @author luifiller
 */
public class TesteAtividade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Atividade atividade01 = new Atividade("Pull request", 
                    "Luiz Nison", 
                    5);
        Atividade atividade02 = new Atividade("Merge", 
                    "Luiz Nison", 
                    2);
        Atividade atividade03 = new Atividade("Create branch 'wip-001-dashboard'", 
                    "Luiz Nison", 
                    1);

        System.out.println("Digite a quantidade de dias usados: ");
        Integer diasUsados01 = leitor.nextInt();

        System.out.println("Digite a quantidade de dias usados: ");
        Integer diasUsados02 = leitor.nextInt();

        System.out.println("Digite a quantidade de dias usados: ");
        Integer diasUsados03 = leitor.nextInt();

        atividade01.terminarAtividade(diasUsados01);
        atividade02.terminarAtividade(diasUsados02);
        atividade03.terminarAtividade(diasUsados03);

        atividade01.exibirRelatorio();
        atividade02.exibirRelatorio();
        atividade03.exibirRelatorio();

        System.out.println(atividade01);
        System.out.println(atividade02);
        System.out.println(atividade03);
    }
}
