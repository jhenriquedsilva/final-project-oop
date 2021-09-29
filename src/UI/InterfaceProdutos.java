package ui;
import recursos.Cores;
import java.util.Scanner;

import produtos.Produtos;


public class InterfaceProdutos implements Interface{
    Scanner scanner = new Scanner(System.in);   
    int decisaoCliente;

    @Override
    public void mostrarInterface() {

        Produtos[] produtos = Produtos.values();

        do { 
            System.out.println(Cores.ANSI_YELLOW_2 + "   BARATOSHOP" + Cores.ANSI_RESET);
            System.out.println(Cores.ANSI_BLUE_2 + """
!ESCOLHA UM SETOR!

[1] VEGETAIS [2] FRUTAS
[3] BISCOITOS [4] NÃO PERECÍVEL
[5] FINALIZAR COMPRAS""" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
        decisaoCliente = Integer.parseInt(scanner.nextLine());
        System.out.println("");
        } while (decisaoCliente != 1 && decisaoCliente != 2 && decisaoCliente != 3 && decisaoCliente != 4 && decisaoCliente != 5);

        switch (decisaoCliente){
            case 1:
            System.out.println(Cores.ANSI_YELLOW_2 + "    VEGETAIS" + Cores.ANSI_RESET);
                for (Produtos produto : produtos) {
                    if (produto.getSetor().equals("Vegetais")) {
                        System.out.println(produto);
                    }
                }
           
            break;
            case 2:
                System.out.println(Cores.ANSI_YELLOW_2 + "    FRUTAS" + Cores.ANSI_RESET);
                for (Produtos produto : produtos) {
                    if (produto.getSetor().equals("Frutas")) {
                        System.out.println(produto);
                    }
                }
            
            break;
            case 3:
                System.out.println(Cores.ANSI_YELLOW_2 + "    BISCOITOS" + Cores.ANSI_RESET);
                for (Produtos produto : produtos) {
                    if (produto.getSetor().equals("Biscoitos")) {
                        System.out.println(produto);
                    }
                }
            
            break;
            case 4:
            System.out.println(Cores.ANSI_YELLOW_2 + "    NÃO PERECÍVEIS" + Cores.ANSI_RESET);
                for (Produtos produto : produtos) {
                    if (produto.getSetor().equals("Basico")) {
                        System.out.println(produto);
                    }
                }
            
            break;
        }
        scanner.close();

        /*
        Criar um vetor para colocar todos os ids.
        Adicionar as coisas no carrinho e finalizar a compra
        Criar a lógica para adicionar os produtos no carrinho e perguntar se o cliente quer finalizar
        */
    }  
}
