package br.com.fiap.models;

import java.util.Scanner;

public class Menu extends Produto{


    //+exibirMenu():VOID
    @Override
    public void exibirMenu(){
        System.out.println("\nBem-vindo ao site da Amazon!\n" +"\n=============================\n" + "\nVocê está na categoria Roupas, Calçados e Acessórios " );
        System.out.println("\n=============================\n");

    }
}
