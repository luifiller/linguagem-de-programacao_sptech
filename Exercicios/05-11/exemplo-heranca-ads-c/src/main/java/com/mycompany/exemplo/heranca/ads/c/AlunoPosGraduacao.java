package com.mycompany.exemplo.heranca.ads.c;

/**
 *
 * @author luifiller
 */
// Subclasse ou classe filha
public class AlunoPosGraduacao extends Aluno {

    private Double notaTcc;
    private Double notaArtigo;

    public AlunoPosGraduacao(Double notaTcc, Double notaArtigo, String nome,
            String ra, Double nota01, Double nota02) {
        super(nome, ra, nota01, nota02);
        this.notaTcc = notaTcc;
        this.notaArtigo = notaArtigo;
    }

    @Override
    public Double calcularMedia() {
        return (this.nota01 + this.nota02 + this.notaTcc + this.notaArtigo) / 4.0;
    }

    public void exibirTCC() {
        System.out.println("Exibinido TCC do aluno...");
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }

    @Override
    public String toString() {
        return String.format("%s\n"
                + "Nota TCC: %.1f \n"
                + "Nota Artigo: %.1f \n"
                + "Média Pós: %.1f", super.toString(), this.notaTcc,
                this.notaArtigo, this.calcularMedia());
    }
}
