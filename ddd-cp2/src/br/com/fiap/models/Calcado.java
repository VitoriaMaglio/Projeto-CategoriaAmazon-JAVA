//Vitória Valentina Maglio RM563509
//Felipe Maglio Filho RM563512
//Tema sorteado: Roupas, calçados e acessórios
package br.com.fiap.models;

import br.com.fiap.enums.TipoCategoriaEnum;
import br.com.fiap.enums.TipoProdutoEnum;

public class Calcado extends Produto{
    //atributos
    private String tamanho;
    private String cor;
    private String material;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
