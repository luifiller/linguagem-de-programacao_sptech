package com.mycompany.correcao.rh.colaborador;

/**
 *
 * @author luifiller
 */
public class Colaborador {

    private String name;
    private String cargo;
    private Double salario;

    /*
    CONSTRUTOR:
    Sempre é public
    Sempre tem o mesmo nome que a classe
    Nunca possui retorno especificado
     */
    public Colaborador(String name, String cargo, Double salario) {
        this.name = name;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Colaborador(String name, String cargo) {
        this.name = name;
        this.cargo = cargo;
        this.salario = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \n"
                + "Cargo: %s \n"
                + "Salario: %.2f \n", name, cargo, salario);
    }

}
