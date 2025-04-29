package br.com.fiap.tests;

import br.com.fiap.enums.TipoCategoriaEnum;
import br.com.fiap.enums.TipoProdutoEnum;
import br.com.fiap.models.Menu;
import br.com.fiap.models.Roupa;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);

        Roupa roupa = new Roupa();
        Menu menu = new Menu();

        menu.exibirMenu();
        System.out.println(" Tipos de produtos: \n1-Roupa\n2-Calçado\n3-Acessório" + "\nInforme o tipo do seu produto: ");
        String tipo = leitor.nextLine();
        if (tipo == "Roupa")
            roupa.setTipoproduto(TipoProdutoEnum.ROUPA);
        else if (tipo == "Calçado")
            roupa.setTipoproduto(TipoProdutoEnum.CALCADO);
        else
            roupa.setTipoproduto(TipoProdutoEnum.ACESSORIO);

        System.out.println("=============================");

        System.out.println(" Categorias de produtos: \n1-Feminino\n2-Masculino\n3-Infantil e bebê\n4-Esportes" + "\nInforme a categoria do seu produto:");
        int opcao = leitorNumerico.nextInt();
        if(opcao == 1)
            roupa.setTipocategoria(TipoCategoriaEnum.FEMININO);
        else if (opcao == 2)
            roupa.setTipocategoria(TipoCategoriaEnum.MASCULINO);
        else if (opcao == 3)
            roupa.setTipocategoria(TipoCategoriaEnum.INFANTILBEBE);
        else
            roupa.setTipocategoria(TipoCategoriaEnum.ESPORTE);

        System.out.println("=============================");

        System.out.println(" Informe o nome do seu produto: ");
        roupa.setNome(leitor.nextLine());
        System.out.println(" Informe a marca do seu produto: ");
        roupa.setMarca(leitor.nextLine());
        System.out.println(" Informe o preço do seu produto: ");
        roupa.setPreco(leitor.nextDouble());
        leitor.nextLine(); // consome a quebra de linha pendente
        // consome a quebra de linha pendente

        System.out.println(" Informe o tamanho do seu produto: ");
        roupa.setTamanho(leitor.nextLine());

        System.out.println(" Informe a cor do seu produto: ");
        roupa.setCor(leitor.nextLine());
        System.out.println(" Informe o material do seu produto: ");
        roupa.setMaterial(leitor.nextLine());

        roupa.exibirProduto();

        System.out.println("=============================");
        System.out.println(" Preço do produto com desconto: " + roupa.calcularDesconto());



        }


}
