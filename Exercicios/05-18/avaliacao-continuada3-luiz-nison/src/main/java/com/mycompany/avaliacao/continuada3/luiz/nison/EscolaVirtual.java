package com.mycompany.avaliacao.continuada3.luiz.nison;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luifiller
 */
public class EscolaVirtual {
    private String nome;
    private Integer vagas;
    private List<Professor> listaProf;

    public EscolaVirtual(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaProf = new ArrayList();
    }

    public void contratarProfessor(Professor prof) {
        if (this.vagas > 0) {
            this.listaProf.add(prof);
        } else {
            System.out.println(String.format("A escola virtual %s não possui "
                    + "vagas disponíveis", this.nome));
        }
    }
    
    public void exibirTodos() {
        if (!this.listaProf.isEmpty()) {
            System.out.println(this.listaProf);
        } else {
            System.out.println(String.format("A escola virtual %s não "
                    + "possui professores", this.nome));
        }
    }
    
    public void exibePalestrante() {
        if (!this.listaProf.isEmpty()) {
            for (int i = 0; i < this.listaProf.size(); i++) {
                if (this.listaProf.get(i) instanceof Palestrante) {
                    System.out.println(this.listaProf.get(i).toString());
                }
            }
        } else {
            System.out.println(String.format("A escola virtual %s não "
                    + "possui palestrantes",this.nome));
        }
    }
    
    public void exibeFolhaDePagamento() {
        Double somaSalarios = 0.0;
        System.out.println("""
                            --------------------------------------
                            |         Folha de Pagamento         |
                            --------------------------------------
                            """);
        
        for (int i = 0; i < this.listaProf.size(); i++) {
            System.out.println(String.format("""
                            \n Nome: %s \n
                            Salário: R$%.2f \n
                            """, this.listaProf.get(i).getNome(), 
                            this.listaProf.get(i).calcularGanho())
            );        
            
            somaSalarios += this.listaProf.get(i).calcularGanho();
        }        
        
        System.out.println(String.format("""
                            Total de funcionários: %d \n
                            Total a ser pago: R$%.2f \n
                            --------------------------------------
                           """, this.listaProf.size(), 
                            somaSalarios)
        );
    }
    
    public void atualizarValorCusto(String nomeCurso, Double valorNovo) {
        for (int i = 0; i < this.listaProf.size(); i++) {
            if (!this.listaProf.get(i).getCurso().equals(nomeCurso)) {
                System.out.println("Curso inexiste.");
            } else {
                this.listaProf.get(i).setCurso(nomeCurso);
            }
        }
    }
    
    public Professor buscarProfessor(String nome) {
        for (int i = 0; i < this.listaProf.size(); i++) {
            if (this.listaProf.get(i).getNome().equalsIgnoreCase(nome)) {
                return this.listaProf.get(i);
            }
        }
        System.out.println("Professor procurado não existe");
        return null;
    }

    
    @Override
    public String toString() {
        return String.format("""
                             --------------------------------------
                             |            Escola Virtual          |
                             --------------------------------------
                             Nome: %s \n
                             Total de vagas: %d \n
                             Lista de professores: %s \n
                             --------------------------------------
                             """, this.nome, this.vagas, 
                             this.listaProf);
    }
}
