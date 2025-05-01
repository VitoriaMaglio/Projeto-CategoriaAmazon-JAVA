package br.com.fiap.models;

import br.com.fiap.enums.TipoCategoriaEnum;
import br.com.fiap.enums.TipoProdutoEnum;

import java.util.Scanner;

public class Roupa extends Produto{

    //atributos
    private String tamanho;
    private String cor;
    private String material;

    @Override
    public void exibirProduto(){
        System.out.println("Descrição do produto:");
        System.out.println("Nome: " + getNome());
        System.out.println("Categoria: " + getTipocategoria());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: " + getPreco());
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Cor: " + getCor());
        System.out.println("Material: " + getMaterial());

    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


}
