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
        if (qtdSalarioMinimo <= 2) {
            return "E";
        } else if  (qtdSalarioMinimo <= 4){
            return "D";
        } else if  (qtdSalarioMinimo <= 10){
            return "C";
        } else if (qtdSalarioMinimo <= 20900.){
            return "B";
        } else {
            return "A";
        }
    }
}
