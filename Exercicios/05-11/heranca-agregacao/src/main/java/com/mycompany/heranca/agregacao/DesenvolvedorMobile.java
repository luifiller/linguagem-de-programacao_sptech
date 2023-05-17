
package com.mycompany.heranca.agregacao;

/**
 *
 * @author luifiller
 */
public class DesenvolvedorMobile extends Desenvolvedor {
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(Integer qtdHorasTrabalhadasMobile, 
            Double valorHoraTrabalhadaMobile, String nome, Integer qtdHorasTrabalhadas, 
            Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }
    
    public Double getSalario1() {
        return super.getSalario() + (qtdHorasTrabalhadasMobile * valorHoraTrabalhadaMobile);
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public String toString() {
        return String.format("""
                             ----------------------------------------- \n
                             \n %s \n
                             |    Desenvolvedor Mobile    | \n
                             Total horas trabalhadas: %d \n
                             Valor por hora: R$%.2f \n
                             Total do salário do dev (dev normal + dev mobile): R$%.2f
                             """, super.toString(), this.qtdHorasTrabalhadasMobile,
                             this.valorHoraTrabalhadaMobile, this.getSalario1());
    }
    
}
