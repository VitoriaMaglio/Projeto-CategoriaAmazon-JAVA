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
        if (opcao == 1)
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





        System.out.println("Você gostaria de saber mais sobre nossos produto?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int escolha = leitorNumerico.nextInt();

        if (escolha == 1) {
            System.out.println("Qual é o tipo de produto que escolheu?");
            System.out.println("1 - Roupa");
            System.out.println("2 - Calçado");
            System.out.println("3 - Acessório");

            int tipoProduto = leitorNumerico.nextInt();

            switch (tipoProduto) {
                case 1:
                    System.out.println("Escolha o tipo de roupa:");
                    System.out.println("1 - Blusa");
                    System.out.println("2 - Calça");
                    System.out.println("3 - Bermuda");

                    int roupaEscolhida = leitorNumerico.nextInt();

                    switch (roupaEscolhida) {
                        case 1:
                            System.out.println("A blusa que escolheu é uma peça essencial e versátil no guarda-roupa. Ideal para compor looks casuais ou elegantes, oferece conforto e liberdade de movimento.");
                            break;
                        case 2:
                            System.out.println("A calça que escolheu é prática e elegante, com bom caimento e ideal para o dia a dia ou ambientes mais formais.");
                            break;
                        case 3:
                            System.out.println("A bermuda que escolheu é leve e fresca, perfeita para dias quentes ou momentos de lazer com conforto.");
                            break;
                        default:
                            System.out.println("Opção de roupa inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Escolha o tipo de calçado:");
                    System.out.println("1 - Tênis");
                    System.out.println("2 - Chuteira");
                    System.out.println("3 - Chinelo");

                    int calcadoEscolhido = leitorNumerico.nextInt();

                    switch (calcadoEscolhido) {
                        case 1:
                            System.out.println("O tênis que escolheu combina conforto, estilo e versatilidade, sendo ideal tanto para o cotidiano quanto para atividades físicas.");
                            break;
                        case 2:
                            System.out.println("A chuteira que escolheu oferece tração, estabilidade e desempenho para jogos de futebol, com design voltado ao esporte.");
                            break;
                        case 3:
                            System.out.println("O chinelo é que escolheu prático e confortável, ideal para uso casual, dias quentes e momentos de descanso.");
                            break;
                        default:
                            System.out.println("Opção de calçado inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Escolha o tipo de acessório:");
                    System.out.println("1 - Óculos");
                    System.out.println("2 - Mochila");
                    System.out.println("3 - Mala");

                    int acessorioEscolhido = leitorNumerico.nextInt();
                    switch (acessorioEscolhido) {
                        case 1:
                            System.out.println("Os óculos que escolheu são acessórios funcionais e estilosos, oferecendo proteção e um toque de personalidade.");
                            break;
                        case 2:
                            System.out.println("A mochila que escolheu é ideal para o dia a dia, com espaço e praticidade para carregar seus itens com conforto.");
                            break;
                        case 3:
                            System.out.println("A mala que escolheu é essencial para viagens, combinando espaço interno, resistência e organização.");
                            break;
                        default:
                            System.out.println("Opção de acessório inválida.");
                    }
                    break;
                default:
                    System.out.println("Tipo de produto inválido.");
            }
        } else if (escolha == 2) {
            System.out.println("Ok! Fique à vontade para perguntar depois.");
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 (Sim) ou 2 (Não).");
        }
    }
}