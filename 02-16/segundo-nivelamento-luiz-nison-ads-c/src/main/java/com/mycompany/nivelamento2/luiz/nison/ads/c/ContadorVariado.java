package com.mycompany.nivelamento2.luiz.nison.ads.c;

/**
 *
 * @author luizn
 */
public class ContadorVariado {
    public static void main(String[] args) {
        for (Double i = 0.15; i <= 5.00;) {
            System.out.println(String.format("%.2f", i));
            
            i = i + 0.15;
        }
    }
}
