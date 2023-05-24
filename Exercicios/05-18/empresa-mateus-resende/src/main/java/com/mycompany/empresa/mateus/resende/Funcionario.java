package com.mycompany.empresa.mateus.resende;

/**
 *
 * @author luifiller
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private Integer diasTrablhados;
    private Double salario;

    public Funcionario(String nome, String cpf, Integer diasTrablhados, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.diasTrablhados = diasTrablhados;
        this.salario = salario;
    }
    
    public Double calcularDiaHora(Integer diasTrabalhados, Double salario) {
        return this.salario  / this.diasTrablhados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getDiasTrablhados() {
        return diasTrablhados;
    }

    public void setDiasTrablhados(Integer diasTrablhados) {
        this.diasTrablhados = diasTrablhados;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("""
                             ------------------------------
                             Funcionário
                             ------------------------------
                             Nome: %s \n
                             CPF: %s \n
                             Dias trabalhados: %d \n
                             Salário: R$%.2f
                             """, this.nome, this.cpf, 
                             this.diasTrablhados, this.salario);
    }
    
    
    
    
}
