package com.mycompany.exemplo.relacionamento.ads.c;

/**
 *
 * @author luifiller
 */
public class WhatsApp {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Luiz", "11973721555");
        Contato contato02 = new Contato("Giulia", "11973751888");
        Contato contato03 = new Contato("Pedro", "11973701688");
       
        Grupo grupo01 = new Grupo("Amigos");
        grupo01.adicionar(contato03);
        grupo01.adicionar(contato02);
    
        Grupo grupo02 = new Grupo("Pessoal");
        grupo02.adicionar(contato01);
        
        System.out.println(grupo01);
        System.out.println(grupo02);
    }
}
