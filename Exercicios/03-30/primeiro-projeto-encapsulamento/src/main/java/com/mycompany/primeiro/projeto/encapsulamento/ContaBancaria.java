/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiro.projeto.encapsulamento;

/**
 *
 * @author luifiller
 */
public class ContaBancaria {

    private Double saldo = 0.0;
    private String nomeTitular;

    public void depositar(Double valorDeposito) {
        if (valorDeposito > 0.0) {
            System.out.println("Deposito realizado.");
            saldo += valorDeposito; 
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(Double valorSaque) {
        if (valorSaque <= saldo && valorSaque > 0.0) {
            saldo -= valorSaque;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
}
