package com.mycompany.metodos;

/**
 *
 * @author luizn
 */
public class TesteMetodos {

    public static void main(String[] args) {
        // para utilizar os métodos das classes, precisa criar objetos, ou seja, fazer uma instância
        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();

        String nome01 = "Xampson";
        String nome02 = "Luiz";

        util.exibirLinha();
        util.exibirNome(nome01);
        util.exibirLinha();

        util.exibirLinha();
        util.exibirNome(nome02);
        util.exibirLinha();

        // O parâmetro tem que ser do mesmo tipo da variável e vice-versa
        util.exibirLinha();
        util.exibirNome("Giulia");
        util.exibirLinha();

        // As linhas de cima podem ser subtraidas se utilizar o método exibirNomeFormatado
        util.exibirNomeFormatado(nome02);

        System.out.println("Soma: ");
        Integer numeroFixoSoma = 15;
        calc.exibirSoma(numeroFixoSoma, 32);

        Integer resultadoSoma = calc.somar(numeroFixoSoma, 10);
        System.out.println("Direto do print: " + resultadoSoma);

        Integer resultadoSubtracao = calc.subtrair(10, numeroFixoSoma);
        System.out.println("Subtração direto do return: " + resultadoSubtracao);

        Integer resultadoMultiplicacao = calc.multiplicar(10, numeroFixoSoma);
        System.out.println("Multiplicação direto do return: " + resultadoMultiplicacao);

        Double resultadoDivisao = calc.dividir(10.0, 5.5);
        System.out.println("Divisão direto do return: " + resultadoDivisao);
    }
}
