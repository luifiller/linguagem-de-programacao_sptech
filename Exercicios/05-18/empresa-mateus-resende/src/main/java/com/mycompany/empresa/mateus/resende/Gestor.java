package com.mycompany.empresa.mateus.resende;

/**
 *
 * @author luifiller
 */
public class Gestor extends Funcionario {
    private Integer quantidadeHoraExtra;
    private Double valorHoraExtra;
    private Double BonusDiario;

    public Gestor(Integer quantidadeHoraExtra, Double valorHoraExtra, 
            Double BonusDiario, String nome, String cpf, 
            Integer diasTrablhados, Double salario) {
        super(nome, cpf, diasTrablhados, salario);
        this.quantidadeHoraExtra = quantidadeHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
        this.BonusDiario = BonusDiario;
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

    public Integer getQuantidadeHoraExtra() {
        return quantidadeHoraExtra;
    }

    public void setQuantidadeHoraExtra(Integer quantidadeHoraExtra) {
        this.quantidadeHoraExtra = quantidadeHoraExtra;
    }

    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public Double getBonusDiario() {
        return BonusDiario;
    }

    public void setBonusDiario(Double BonusDiario) {
        this.BonusDiario = BonusDiario;
    }

    @Override
    public String toString() {
        return String.format("""
                             ------------------------------
                             Gestor
                             ------------------------------
                             %s \n
                             Quantidade hora extra: %d \n
                             Valor hora extra: %.2f \n
                             Valor bônus diário: %.2f
                             """, super.toString(), this.quantidadeHoraExtra, 
                             this.valorHoraExtra, this.BonusDiario);
    }
    
    
}
