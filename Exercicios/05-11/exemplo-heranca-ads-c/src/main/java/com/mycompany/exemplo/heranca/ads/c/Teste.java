package com.mycompany.exemplo.heranca.ads.c;

/**
 *
 * @author luifiller
 */
public class Teste {
    public static void main(String[] args) {
        Aluno alunoComum = new Aluno("Luiz", "0011", 9.0, 9.5);
        Aluno alunoPos = new AlunoPosGraduacao(9.8, 9.5, 
                "David", "0022", 10.0, 9.0);
        
        Faculdade faculdade01 = new Faculdade("SPTECH");
        faculdade01.matricular(alunoComum);
        faculdade01.matricular(alunoPos);
        
        
        System.out.println("Nome aluno pós: " + alunoPos.getNome());
        
        System.out.println(String.format("Média Pós-Graduação: %.1f", 
                alunoPos.calcularMedia()));
        
        System.out.println(String.format("Média Graduação: %.1f", 
                alunoComum.calcularMedia()));
        
        System.out.println("-------------------------------\n"
                + "Pós-graduação: \n" + alunoPos);
    }
}
