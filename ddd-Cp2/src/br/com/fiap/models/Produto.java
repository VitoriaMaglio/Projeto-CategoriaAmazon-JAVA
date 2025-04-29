//Vitória Valentina Maglio RM563509
//Felipe Maglio Filho RM563512

package br.com.fiap.models;

import java.util.Scanner;

public abstract class Produto  {

    //atributos
    private String nome;
    private String marca;
    private double preco;
    private String descricao;
    private String categoria;
    private int avaliacao;


    //métodos
    //+exibirDetalhes():VOID
    public void exibirDetalhes(){
        avaliacao = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Descreva com detalhes o produto que você deseja comprar: ");

    }

}
