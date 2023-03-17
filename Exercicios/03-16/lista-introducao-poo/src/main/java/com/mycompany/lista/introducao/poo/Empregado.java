package com.mycompany.lista.introducao.poo;

/**
 *
 * @author luizn
 */
public class Empregado {

    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Double porcentagemReajuste) {
        Double salarioReajustado;
        porcentagemReajuste /= 100;

        salarioReajustado = (salario * porcentagemReajuste) + salario;

        System.out.println(String.format("""
                                         ----------------------------------
                                         Nome: %s
                                         Cargo: %s
                                         Salário atual: R#%.2f
                                         Salário reajustado: R$%.2f
                                         ----------------------------------
                                         """, nome, cargo,
                salario, salarioReajustado));
    }
}
