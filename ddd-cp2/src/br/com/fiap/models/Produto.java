//Vitória Valentina Maglio RM563509
//Felipe Maglio Filho RM563512

package br.com.fiap.models;

import br.com.fiap.enums.TipoCategoriaEnum;
import br.com.fiap.enums.TipoProdutoEnum;

import java.util.Scanner;

public abstract class Produto  {

    //atributos
    private String tipo;
    protected String nome;
    private String marca;
    protected double preco;
    private String descricao;
    private String categoria;
    private int avaliacao;
    private TipoCategoriaEnum tipocategoria;
    private TipoProdutoEnum tipoproduto;

    //métodos

    public void exibirMenu(){}
    public void exibirProduto(){}

    //+calcularDesconto():double
    public double calcularDesconto() {
        double valorDesconto = 10.0;
        if (preco > 70) {
            System.out.println("Você possui um cupom de desconto!");
            return preco - valorDesconto;
        }
        return preco;
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
    public TipoCategoriaEnum getTipocategoria() {
        return tipocategoria;
    }

    public void setTipocategoria(TipoCategoriaEnum tipocategoria) {
        this.tipocategoria = tipocategoria;
    }

    public TipoProdutoEnum getTipoproduto() {
        return tipoproduto;
    }

    public void setTipoproduto(TipoProdutoEnum tipoproduto) {
        this.tipoproduto = tipoproduto;
    }
}
