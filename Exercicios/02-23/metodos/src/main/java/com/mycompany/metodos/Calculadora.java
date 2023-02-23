package com.mycompany.metodos;

/**
 *
 * @author luizn
 */
public class Calculadora {

    void exibirSoma(Integer numero01, Integer numero02) {
        System.out.println(numero01 + numero02);
    }

    /* 
    Quando o método tem retorno, geralmente não utiliza "print" porque já 
    retorna dado isso porque pode fazer esquecer de usar o retorno onde o método é chamado
     */
    Integer somar(Integer numeroRetorno01, Integer numeroRetorno02) {
        return (numeroRetorno01 + numeroRetorno02);
    }

    // subtrair(){}
    Integer subtrair(Integer numeroSubtrcao01, Integer numeroSubtrcao02) {
        return (numeroSubtrcao01 - numeroSubtrcao02);
    }

    Integer multiplicar(Integer numeroMultiplicacao01, Integer numeroMultiplicacao02) {
        return (numeroMultiplicacao01 * numeroMultiplicacao02);
    }

    Double dividir(Double numeroDivisao01, Double numeroDivisao02) {
        return (numeroDivisao01 / numeroDivisao02);
    }

    // O método abaixo substitui o If-Else que verificaria se é ou não par para depois retornar
    Boolean isPar(Double numeroVerificar) {
        Boolean isPar = numeroVerificar % 2 == 0;

        return isPar;
    }

    /*
    O método abaixo sobrecarrega o método "somar" lá de cima e dá mais 
    uma possibilidade de calcular com outros argumentos
     */
    Integer somar(Integer numeroRetorno01, Integer numeroRetorno02, Integer numeroRetorno03) {
        return (numeroRetorno01 + numeroRetorno02 + numeroRetorno03);
    }
}
