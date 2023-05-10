package com.bandtec.projeto.lista.desafio3;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.alunos = new ArrayList<>();
        this.nome = nome;
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
     */
    public Boolean existsAlunoPorNome(String nome) {
        String nomeAlunoAtual;

        for (int i = 0; i < alunos.size(); i++) {
//            nomeAlunoAtual = alunos.get(i).getNome();

            if (alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
     */
    public void matricularAluno(Aluno aluno) {        
        if (aluno != null) {
            if (existsAlunoPorNome(aluno.getNome())) {
                System.out.println("Aluno já está cadastrado, "
                        + "portanto não será cadastrado novamente");
            } else {
                this.alunos.add(aluno);
            }
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
     */
    public void cancelarMatricula(String ra) {
        String raAtual;
        
        if (ra != null) {
            for (int i = 0; i < alunos.size(); i++) {
                raAtual = alunos.get(i).getRa();
                
                if (raAtual.equals(ra)) {
                    alunos.get(i).setAtivo(false);
                } else {
                    System.out.println("O aluno ainda não tem matrícula ativa.");
                }
            }
        }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
     */
    public Integer getQuantidadeAlunos() {
        return alunos.size();
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        return alunos.stream().filter(res -> res.getSemestre().equals(semestre)).toList().size();
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer cont = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (!alunos.get(i).isAtivo()) {
                cont ++;
            }
        }
        
        return cont;
//        return alunos.stream().filter(res -> res.isAtivo() == false).toList().size();
    }

    public String getNome() {
        return this.nome;
    }
}
