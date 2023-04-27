package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList<>();
    }

    public Integer count() {
        return inteiros.size();
    }

    public void add(Integer valor) {
        if (valor != null) {
            this.inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if (valor != null) {
            this.inteiros.remove(valor);
        }
    }

    public Integer countPares() {
        Integer contPares = 0;

        if (!inteiros.isEmpty()) {
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) % 2 == 0) {
                    contPares++;
                }
            }
            return contPares;
        }
        return 0;
    }

    public Integer countImpares() {
        Integer contImpares = 0;

        if (!inteiros.isEmpty()) {
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) % 2 != 0) {
                    contImpares++;
                }
            }

            return contImpares;
        }

        return 0;
    }

    public Integer somar() {
        Integer somaTotal = 0;
        if (inteiros.size() <= 0) {
            somaTotal = 0;
        } else {
            for (int i = 0; i < inteiros.size(); i++) {
                somaTotal += inteiros.get(i);
            }
        }

        return somaTotal;
    }

    public Integer getMaior() {
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            Integer maiorNumero = inteiros.get(0);

            for (int i = 1; i < inteiros.size(); i++) {
                Integer numeroDaVez = inteiros.get(i);

                if (numeroDaVez > maiorNumero) {
                    maiorNumero = numeroDaVez;
                }
            }
            return maiorNumero;
        }
    }

    public Integer getMenor() {

        if (inteiros.isEmpty()) {
            return 0;
        } else {
            Integer menorNumero = inteiros.get(0);

            for (int i = 1; i < inteiros.size(); i++) {
                Integer numeroDaVez = inteiros.get(i);

                if (numeroDaVez < menorNumero) {
                    menorNumero = numeroDaVez;
                }
            }
            return menorNumero;
        }

    }

    public Boolean hasDuplicidade() {

        for (int i = 1; i < inteiros.size(); i++) {
            int cont = 0;
            Integer numeroDaVez = inteiros.get(i);

            for (Integer inteiro : inteiros) {
                if (numeroDaVez.equals(inteiro)) {
                    cont++;
                }
            }

            if (cont > 1) {
                return true;
            }
        }

        return false;
    }
}
