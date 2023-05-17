/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo.heranca.ads.c;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luifiller
 */
public class Faculdade {
    private String nome;
    private List <Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    
    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
    // instanceof valida qual o tipo da classe 
    public void exibirAlunosPosGraduacao() {
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoPosGraduacao) {
                System.out.println(aluno);
            }
        }
    }
    
}
