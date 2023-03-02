/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcao.exercicio.metodo;

/**
 *
 * @author luizn
 */
public class ClasseSocial {

    Double calcularEretornarQtdSalarioMinimo(Double salarioDigitadoUsuario) {
        return (salarioDigitadoUsuario / 1045.00);
    }

    Double calcularEretornarQtdSalarioMinimo(Double salarioDigitadoUsuario, Double salarioMinimo) {
        return (salarioDigitadoUsuario / salarioMinimo);
    }

    String identificarClasseSocial(Double qtdSalarioMinimo) {
        String frase;

        if (qtdSalarioMinimo <= 2) {
            frase = "E";
        } else if (qtdSalarioMinimo <= 4) {
            frase = "D";
        } else if (qtdSalarioMinimo <= 10) {
            frase = "C";
        } else if (qtdSalarioMinimo <= 20) {
            frase = "B";
        } else {
            frase = "A";
        }
        return frase;
    }
}
