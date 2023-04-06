package com.mycompany.correcao.rh.colaborador;

/**
 *
 * @author luifiller
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab01 = new Colaborador();
        colab01.setName("Aldo");
        colab01.setCargo("Analista de Sistemas Júnior");
        colab01.setSalario(2000.00);

        Colaborador colab02 = new Colaborador();
        colab02.setName("Geraldina");
        colab02.setCargo("DBA PLeno");
        colab02.setSalario(2500.00);

        RecursosHumanos rh = new RecursosHumanos();

        rh.exibirColaborador(colab01);
        rh.exibirColaborador(colab02);

        rh.promoverColaborador(colab01, "Analista de Sistamas Pleno", 3500.00);
        rh.promoverColaborador(colab02, "DBA Sênior", 5500.00);

        rh.reajustarSalario(colab01, 150.00);

        rh.exibirColaborador(colab01);
        rh.exibirColaborador(colab02);

        System.out.println(String.format("Total de promoções: %d", rh.getTotalPromocoes()));

        System.out.println(String.format("Total de salários reajustados: %d", rh.getTotalSalariosReajustados()));

    }
}
