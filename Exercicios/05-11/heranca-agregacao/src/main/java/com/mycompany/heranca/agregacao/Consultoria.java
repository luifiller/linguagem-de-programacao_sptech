package com.mycompany.heranca.agregacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luifiller
 */
public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> devs;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.devs = new ArrayList<>();
    }
    
    public Boolean existePorNome(String nome) {
        for (int i = 0; i < devs.size(); i++) {
            if (devs.get(i).nome.equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public void contratar(Desenvolvedor d) {
        if (this.existePorNome(nome)) {
            System.out.println("Esse desenvolvedor já está contratado conosco.");
        } else if (this.vagas.equals(0)) {
            System.out.println("Sem vagas disponíveis.");
        } else {
            devs.add(d);
            
            System.out.println("Desenvolvedor contratado.");
            
            this.vagas --;
        }
    }
    
    public Integer getQuantidadeDesenvolvedores() {
        return devs.size();
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer count = 0;
        
        for (int i = 0; i < devs.size(); i++) {
            if (devs.get(i) instanceof DesenvolvedorMobile) {
                count++;
            }   
        }
        
        return count;
    }
    
    public Double getTotalSalarios() {
        Double totalSalarios = 0.0;
        
        for (int i = 0; i < devs.size(); i++) {
            totalSalarios += devs.get(i).getSalario();
        }
        
        return totalSalarios;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome) {
        for (int i = 0; i < devs.size(); i++) {
            if (devs.get(i).nome.equalsIgnoreCase(nome)) {
                return devs.get(i);
            }
        }
        
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Desenvolvedor> getDevs() {
        return devs;
    }

    public void setDevs(List<Desenvolvedor> devs) {
        this.devs = devs;
    }

    @Override
    public String toString() {
        return String.format("""
                             ---------------------------- \n
                             |        Consultoria       | \n
                             ---------------------------- \n
                             Nome: %s \n
                             Total de vagas: %d \n
                             Todos Desenvolvedores: %s \n
                             ----------------------------
                             """, this.nome, this.vagas, this.devs);
    }
}
