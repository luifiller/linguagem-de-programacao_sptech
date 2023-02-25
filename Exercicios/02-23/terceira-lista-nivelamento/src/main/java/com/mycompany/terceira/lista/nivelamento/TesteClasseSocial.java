
package com.mycompany.terceira.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class TesteClasseSocial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClasseSocial classeSocial = new ClasseSocial();
        
        System.out.println("Digite sua renda: ");
        Double renda = leitor.nextDouble();
        
        
        
        Double qtdSalarioMinimo = classeSocial.calcularEretornarQtdSalarioMinimo(renda);
        String identificacaoClasseSocial = classeSocial.identificarClasseSocial(renda);
        
        System.out.println(String.format("Você recebe aproximadamente: %.2f \n "
                + "Você pertence a classe social: %s salários-mínimos.", qtdSalarioMinimo, identificacaoClasseSocial));
    }
}
