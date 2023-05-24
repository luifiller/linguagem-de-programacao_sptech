package com.mycompany.empresa.mateus.resende;

/**
 *
 * @author luifiller
 */
public class Desenvolvedor extends Funcionario {
    private Double bonusDiario;
    private Double valorHoraExtra;
    private Integer quantidadeHoraExtra;

    public Desenvolvedor(Double bonusDiario, Double valorHoraExtra, 
            Integer quantidadeHoraExtra, String nome, String cpf, 
            Integer diasTrablhados, Double salario) {
        super(nome, cpf, diasTrablhados, salario);
        this.bonusDiario = bonusDiario;
        this.valorHoraExtra = valorHoraExtra;
        this.quantidadeHoraExtra = quantidadeHoraExtra;
    }
    
    public Double calculcarDiaHora(Integer diasTrabalhados, Double salario,
        Double bonusDiario, Double totalHoraExtra) {
        
        Double totalHorasTrabalhadas = (diasTrabalhados * 8) + totalHoraExtra;
        Double totalBonusGanhado = diasTrabalhados * bonusDiario;
                
        return totalHorasTrabalhadas / (salario + totalBonusGanhado);
    }
    
    public Double calcularValorTotalHora(Double valorHoraExtra, Integer quantidadeHoraExtra) {
        return valorHoraExtra * quantidadeHoraExtra;
    }

    public Double getBonusDiario() {
        return bonusDiario;
    }

    public void setBonusDiario(Double bonusDiario) {
        this.bonusDiario = bonusDiario;
    }

    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public Integer getQuantidadeHoraExtra() {
        return quantidadeHoraExtra;
    }

    public void setQuantidadeHoraExtra(Integer quantidadeHoraExtra) {
        this.quantidadeHoraExtra = quantidadeHoraExtra;
    }

    @Override
    public String toString() {
        return String.format("""
                             -----------------------------
                             Desenvolvedor
                             -----------------------------
                             %s \n
                             Valor bônus diário: R$%.2f \n
                             Valor hora extra: R$%.2f \n
                             Quantidade hora extra: %d \n
                             """, super.toString(), this.bonusDiario,
                             this.valorHoraExtra, this.quantidadeHoraExtra);
    }
    
    
    
    
}
