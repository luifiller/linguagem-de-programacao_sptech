package com.mycompany.nivelamento2.luiz.nison.ads.c;

/**
 *
 * @author luizn
 */
public class NumerosPares {

    public static void main(String[] args) {
        Integer numero = 0;

        while (numero <= 40) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        numero++;
        }
    }
}
