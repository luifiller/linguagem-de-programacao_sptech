package com.mycompany.atividade02.ac01;

/**
 *
 * @author luizn
 */
public class ValidacaoNumerica {

    void verificarPrimo(Integer numero01) {
        Integer quantidadeDivisores = 0;
        Integer cont = 0;

        for (int i = 1; i <= numero01; i++) {
            if (numero01 % i == 0) {
                cont++;
            }
        }

        if (cont.equals(2)) {
            System.out.println("O número " + numero01 + " é primo.");
        } else {
            System.out.println("O número " + numero01 + " NÃO é primo.");
        }
    }
}
