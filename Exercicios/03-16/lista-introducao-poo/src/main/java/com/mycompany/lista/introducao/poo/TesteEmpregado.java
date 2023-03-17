package com.mycompany.lista.introducao.poo;

/**
 *
 * @author luizn
 */
public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado empregado01 = new Empregado();
        empregado01.nome = "João";
        empregado01.salario = 5400.00;
        empregado01.cargo = "Analista de Sistemas";
        empregado01.reajustarSalario(15.00);

        Empregado empregado02 = new Empregado();
        empregado02.nome = "Luiz";
        empregado02.salario = 1800.00;
        empregado02.cargo = "Estagiário";
        empregado02.reajustarSalario(5.50);
    }
}
