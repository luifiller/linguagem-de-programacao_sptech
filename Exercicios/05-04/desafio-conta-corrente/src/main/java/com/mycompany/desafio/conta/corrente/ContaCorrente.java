package com.mycompany.desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;
import javax.crypto.interfaces.PBEKey;

/**
 *
 * @author luifiller
 */
public class ContaCorrente {

    private String titular;
    private Double saldo;
    private List<Historico> historico;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.historico = new ArrayList();
    }

    public void depositar(Double valor, Integer dia, Integer mes, Integer ano) {
        Boolean valorValido = valor > 0.0;
        Boolean diaValido = dia > 0 && dia <= 31;
        Boolean mesValido = mes > 0 && mes <= 12;
        Boolean anoValido = ano >= 2023;

        if (valorValido && diaValido && mesValido && anoValido) {
            this.saldo += valor;
            historico.add(new Historico(dia, mes, ano, valor, "Deposito"));
            
            
            System.out.println("Deposito realizado com sucesso.");
        } else {
            if (!valorValido) {
                System.out.println("Valor inválido. \n");
            }

            if (!anoValido) {
                System.out.println("Ano inválido. \n");
            }

            if (!mesValido) {
                System.out.println("Mês inválido. \n");
            }

            if (!diaValido) {
                System.out.println("Dia inválido. \n");
            }
        }
    }

    public void sacar(Double valor, Integer dia, Integer mes, Integer ano) {
        Boolean valorValido = valor > 0.0;
        Boolean diaValido = dia > 0 && dia <= 31;
        Boolean mesValido = mes > 0 && mes <= 12;
        Boolean anoValido = ano >= 2023;
        Boolean saldoValido = this.saldo >= valor;

        if (saldoValido && valorValido && diaValido && mesValido && anoValido) {
            this.saldo -= valor;
            historico.add(new Historico(dia, mes, ano, valor, "Saque"));
            
            System.out.println("Saque realizado com sucesso.");
        } else {
            if (!saldoValido) {
                if (this.saldo < valor) {
                    System.out.println("O valor é maior que o saldo atual. \n");
                } else {
                    System.out.println("Valor inválido. \n");
                }
            }

            if (!valorValido) {
                System.out.println("Valor inválido. \n");
            }

            if (!anoValido) {
                System.out.println("Ano inválido. \n");
            }

            if (!mesValido) {
                System.out.println("Mês inválido. \n");
            }

            if (!diaValido) {
                System.out.println("Dia inválido. \n");
            }
        }
    }
    
    public void exibirEstrato() {
        System.out.println(historico);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Historico> historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return String.format("---------------------------- "
                + "Conta Corrente \n"
                + "---------------------------- \n"
                + "Titular: %s \n"
                + "Saldo: R$%.2f \n"
                + "Histórico: %s \n"
                + "---------------------------- \n", titular, saldo, historico);
//                "ContaCorrente{" + "titular=" + titular + ", saldo=" + saldo + ", historico=" + historico + '}';
    }

}
