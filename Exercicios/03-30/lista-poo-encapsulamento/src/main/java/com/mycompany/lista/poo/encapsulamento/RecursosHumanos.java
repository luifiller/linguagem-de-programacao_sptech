package com.mycompany.lista.poo.encapsulamento;

/**
 *
 * @author luifiller
 */
public class RecursosHumanos {

    private Integer promovidos = 0;
    private Integer totalSalariosReajustados = 0;

    public void reajustarSalario(Colaborador colaborador, Double valorReajuste) {
        /*
            -> O bloco abaixo é resumido na linha descomentada.
            Double salario = colaborador.getSalarioColaborador();
            salario += valorReajuste;
            colaborador.setSalarioColaborador(salario);        
         */

        colaborador.setSalarioColaborador(colaborador.getSalarioColaborador() + valorReajuste);
        totalSalariosReajustados++;
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (novoSalario > colaborador.getSalarioColaborador()) {
            colaborador.setSalarioColaborador(novoSalario);
            colaborador.setCargoColaborador(novoCargo);
            promovidos++;
        } else {
            System.out.println("Operação inválida.");
        }
    }

    public Integer getPromovidos() {
        return promovidos;
    }

    public void setPromovidos(Integer promovidos) {
        this.promovidos = promovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    public void setTotalSalariosReajustados(Integer totalSalariosReajustados) {
        this.totalSalariosReajustados = totalSalariosReajustados;
    }

}
