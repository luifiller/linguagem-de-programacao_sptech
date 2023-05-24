package com.mycompany.avaliacao.continuada3.luiz.nison;

/**
 *
 * @author luifiller
 */
public class Professor {
    private String nome;
    private String curso;
    private Double valorCurso;
    private Integer qtdAlunos;

    public Professor(String nome, String curso, Double valorCurso, Integer qtdAlunos) {
        this.nome = nome;
        this.curso = curso;
        this.valorCurso = valorCurso;
        this.qtdAlunos = qtdAlunos;
    }
    
    public Double calcularGanho() {
        return (this.valorCurso * 0.05) * this.qtdAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(Double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(Integer qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    @Override
    public String toString() {
        return String.format("""
                             --------------------------------------
                             |               Professor            |
                             --------------------------------------
                             Nome: %s \n
                             Curso: %s \n
                             Valor curso: R$%.2f \n
                             Quantidade de alunos: %d \n
                             Ganho total (professor): R$%.2f \n
                             --------------------------------------
                             """, this.nome, this.curso, 
                             this.valorCurso, this.qtdAlunos,
                             this.calcularGanho());
    }
    
    
    
    
}
