package ui;

import negocio.Estoque;

import java.util.Scanner;

public class PedidoUI {
    private Scanner ler;

    public PedidoUI(){
    ler = new Scanner(System.in);
    }

    public void menu() {

        Estoque lista1 = new Estoque();
        int op;

        do {
            System.out.println("--DIGITE--");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Visualizar Produtos");
            System.out.println("3- Ver quantidade de produtos");
            System.out.println("4- Apagar todos os produtos");
            System.out.println("5- Alterar quantidade dos produtos");
            System.out.println("6- Remover Item Do Estoque");
            System.out.println("0- Sair");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    lista1.criarProduto();
                    break;

                case 2:
                    lista1.listarProdutos();
                    break;

                case 3:
                    lista1.listarQuantidadeDeProdutosCadastrados();
                    break;

                case 4:
                    lista1.excluirTodosOsItensDoEstoque();
                    break;

                case 5:
                    lista1.alteraQuantidadeDoProduto();
                    break;

                case 6:
                    lista1.removerItemDoEstoque();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        } while (op != 0);
    }
}

