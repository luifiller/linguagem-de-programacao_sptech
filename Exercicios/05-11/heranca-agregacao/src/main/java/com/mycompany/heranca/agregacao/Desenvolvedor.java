package com.mycompany.heranca.agregacao;

/**
 *
 * @author luifiller
 */
public class Desenvolvedor {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Double getSalario() {
        return (qtdHorasTrabalhadas * valorHoraTrabalhada);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("""
                             \n |        Desenvolvedor        |\n
                             Nome: %s \n
                             Total horas trabalhadas: %d \n
                             Valor por hora: R$%.2f \n
                             Salário específico de dev: R$%.2f
                             """, this.nome, this.qtdHorasTrabalhadas,
                             this.valorHoraTrabalhada, this.getSalario());
    }
}
