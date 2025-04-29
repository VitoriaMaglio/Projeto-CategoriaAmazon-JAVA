//Vitória Valentina Maglio RM563509
//Felipe Maglio Filho RM563512

package br.com.fiap.models;

import java.util.Scanner;

public abstract class Produto  {

    //atributos
    private String tipo;
    protected String nome;
    private String marca;
    private double preco;
    private String descricao;
    private String categoria;
    private int avaliacao;




    //métodos

    public void exibirProduto(){

    }


    //+calcularDesconto():double
    public double calcularDesconto(double desconto){
        if (preco > 70)
            return preco - preco * desconto/ 100;
        return preco;

    }


    //+exibirDetalhes():VOID
    public void exibirDetalhes(){
        avaliacao = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o nome do produto que você deseja comprar: ");
        nome = leitor.nextLine();


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
