package com.mycompany.ac2.segunda.atividade;

import java.util.Objects;

/**
 *
 * @author luifiller
 */
public class Atividade {

    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public void terminarAtividade(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    public void exibirRelatorio() {
        if (this.diasUsados > this.diasEstimados) {
            System.out.println(String.format("""
                                             Você estimou %d dias, mas a tarefa foi
                                             feita em %d dias. Melhore a estimativa.
                                             """, diasEstimados, diasUsados));
        } else if (Objects.equals(this.diasUsados, this.diasEstimados)) {
            System.out.println(String.format("""
                                             Você estimou %d dias, e a tarefa foi
                                             feita em %d dias, atendendo a estimativa
                                             com precisão.
                                             """, diasEstimados, diasUsados));
        } else {
            System.out.println(String.format("""
                                             Você estimou %d dias, e a tarefa
                                             foi feita em %d dias. Parabéns!
                                             """, diasEstimados, diasUsados));
        }
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    @Override
    public String toString() {
        return String.format("""
                             Atividade: %s
                             Responsável: %s
                             Dias estimados: %d
                             Dias usados: %d
                             """, nomeAtividade, responsavel, 
                             diasEstimados, diasUsados);
    }
}