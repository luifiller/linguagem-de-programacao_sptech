package com.mycompany.ac2.segunda.atividade.petshop;

import com.mycompany.ac2.segunda.atividade.petshop.PetShop;
import com.mycompany.ac2.segunda.atividade.petshop.Pet;

/**
 *
 * @author luifiller
 */
public class TestePetShop {

    public static void main(String[] args) {
        Pet pet01 = new Pet("Filó", "Salsicha");
        Pet pet02 = new Pet("Rex", "Labrador");

        PetShop petShop01 = new PetShop("Amigo Pet");

        petShop01.darBanho(pet01, 50.00);
        petShop01.darBanho(pet01, 20.00);

        petShop01.darBanho(pet02, 50.00, 10);

        petShop01.exibirInformaçõesPet(pet01);
        petShop01.exibirInformaçõesPet(pet02);

        System.out.println(petShop01);
    }
}
