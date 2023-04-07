package com.mycompany.ac2.segunda.atividade;

/**
 *
 * @author luifiller
 */
public class PetShop {

    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }

    public void darBanho(Pet pet, Double valor) {
        if (valor > 0) {
            pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
            pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valor);
            this.faturamentoTotal += valor;

            System.out.println("O pet " + pet.getNome() + " teve seu banho tomado! \n"
                    + "Custo do banho: R$" + valor);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void darBanho(Pet pet, Double valor, Integer desconto) {
        if (valor > 0) {
            Double valorGastoDescontado = valor - (valor * (desconto / 100.0));
            this.faturamentoTotal += valorGastoDescontado;
            pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
            pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valorGastoDescontado);

            System.out.println(String.format("""
                                             O pet %s teve seu banho tomado com desconto de %d%%!
                                             Custo do banho: R$%.2f
                                             """, pet.getNome(), desconto, valorGastoDescontado));
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void exibirInformaçõesPet(Pet pet) {
        System.out.println(String.format("""
                                             O cachorro %s, da raça %s está de banho tomado! 
                                             Fez %d visitas no PetShop %s. 
                                             Com isso, gastou R$%.2f.
                                             """, pet.getNome(), pet.getRaca(),
                pet.getQtdVisitasAoPetShop(), nome,
                pet.getValorGastoEmPetShop()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    @Override
    public String toString() {
        return String.format("""
                             Nome do PetShop: %s
                             Faturamento total: %.2f
                             """, nome, faturamentoTotal);
    }
}
