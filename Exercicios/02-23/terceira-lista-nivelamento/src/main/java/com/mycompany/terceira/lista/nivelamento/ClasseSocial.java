package com.mycompany.terceira.lista.nivelamento;

/**
 *
 * @author luizn
 */
public class ClasseSocial {
    Double calcularEretornarQtdSalarioMinimo(Double salarioDigitadoUsuario){
        return (salarioDigitadoUsuario / 1045.00);
    }
    
    String identificarClasseSocial(Double qtdSalarioMinimo){
        String frase;
        
        if (qtdSalarioMinimo <= 2) {
            frase = "E";
        } else if  (qtdSalarioMinimo <= 4){
            frase = "D";
        } else if  (qtdSalarioMinimo <= 10){
            frase = "C";
        } else if (qtdSalarioMinimo <= 20){
            frase = "B";
        } else {
            frase = "A";
        }
        return frase;
    }
}
