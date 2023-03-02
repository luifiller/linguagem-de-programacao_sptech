package com.mycompany.correcao.exercicio.metodo;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class TesteClasseSocial {

    public static void main(String[] args) {
        ClasseSocial classe = new ClasseSocial();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira sua renda: ");
        Double rendaDigitada = leitor.nextDouble();

        Double qtdSalario = classe.calcularEretornarQtdSalarioMinimo(rendaDigitada);

        String classeSocial = classe.identificarClasseSocial(qtdSalario);

        System.out.println(
                String.format("Você recebe aproximadamente %.1f "
                        + "salários mínimos", qtdSalario));

        System.out.println(
                String.format("Você pertence a classe social %s",
                        classeSocial));
    }
}
