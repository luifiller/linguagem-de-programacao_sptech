package com.mycompany.empresa.mateus.resende;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luifiller
 */
public class Empresa {
    private String nome;
    private Double capital;
    private Integer vagas;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, Double capital, Integer vagas) {
        this.nome = nome;
        this.capital = capital;
        this.vagas = vagas;
        this.funcionarios = new ArrayList<>();
    }
    
    public void investirCapital(Double investimento) {
        this.capital -= investimento;
    }
    
    public void contratarFuncionario(Funcionario func) {
        this.funcionarios.add(func);
        this.vagas -= 1;
    }
    
    public void demitirFuncionario(Funcionario func) {
        this.funcionarios.remove(func);
        this.vagas += 1;
    }
    
    public void abrirVagas(Integer vagas) {
        this.vagas += vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return String.format("""
                             -----------------------------
                             Empresa
                             -----------------------------
                             Nome: %s \n
                             Capital: %.2f \n
                             Vagas abertas: %d \n
                             Funcionários ativos: %s \n
                             """, this.nome, this.capital,
                             this.vagas ,this.funcionarios);
   }
    
    
        
}
