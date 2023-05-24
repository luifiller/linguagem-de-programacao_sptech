package com.mycompany.avaliacao.continuada3.luiz.nison;

/**
 *
 * @author luifiller
 */
public class Palestrante extends Professor {
    private Integer qtdLive;
    private Double valorLive;

    public Palestrante(Integer qtdLive, Double valorLive, String nome, String curso, Double valorCurso, Integer qtdAlunos) {
        super(nome, curso, valorCurso, qtdAlunos);
        this.qtdLive = qtdLive;
        this.valorLive = valorLive;
    }
    
    @Override
    public Double calcularGanho() {
        return super.calcularGanho() + (this.qtdLive * this.valorLive);
    }

    public Integer getQtdLive() {
        return qtdLive;
    }

    public void setQtdLive(Integer qtdLive) {
        this.qtdLive = qtdLive;
    }

    public Double getValorLive() {
        return valorLive;
    }

    public void setValorLive(Double valorLive) {
        this.valorLive = valorLive;
    }

    @Override
    public String toString() {
        return String.format("""
                             --------------------------------------
                             |            Palestrante             |
                             --------------------------------------
                             %s \n
                             Quantidade de lives: %d \n
                             Valor da live: R$%.2f \n
                             Ganho total (palaestrante): R$%.2f \n
                             --------------------------------------
                             """, super.toString(), this.qtdLive,
                             this.valorLive, this.calcularGanho());
    }
    
    
    
}
