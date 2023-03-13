package com.mycompany.mini.projeto.luiz.nison;

/**
 *
 * @author luizn
 */
public class CalculoIMC {

    Double calcularIMC (Double pesoDigitadoUsuario, Double alturaDigitadoUsuario) {
        return (pesoDigitadoUsuario / (alturaDigitadoUsuario * alturaDigitadoUsuario));
    }

    String retornarClassificacaoIMC(Double totalIMCUsuario) {

        String frase;

        if (totalIMCUsuario < 18.5) {
            frase = "abaixo do peso";
        } else if (totalIMCUsuario < 25) {
            frase = "eutrófico";
        } else if (totalIMCUsuario < 30) {
            frase = "sobrepeso";
        } else if (totalIMCUsuario < 35) {
            frase = "obesidade grau I";
        } else if (totalIMCUsuario < 40) {
            frase = "obesidade grau II";
        } else {
            frase = "obesidade grau III";
        }

        return frase;
    }

    String retornarRiscoComorbidade(Double totalIMCUsuario) {

        String riscoComorbidade;

        if (totalIMCUsuario < 18.5) {
            riscoComorbidade = "baixo risco";
        } else if (totalIMCUsuario < 25) {
            riscoComorbidade = "médio risco";
        } else if (totalIMCUsuario < 30) {
            riscoComorbidade = "risco pouco elevado";
        } else if (totalIMCUsuario < 35) {
            riscoComorbidade = "elevado risco";
        } else if (totalIMCUsuario < 40) {
            riscoComorbidade = "risco muito elevado";
        } else {
            riscoComorbidade = "risco muitíssimo elevado";
        }

        return riscoComorbidade;
    }
}
