package ui;
import recursos.Cores;
import java.util.Scanner;
import produtos.Carrinho;

import produtos.Produtos;


public class InterfaceProdutos implements Interface {
    private Scanner scanner = new Scanner(System.in);   
    private int decisaoCliente;

    @Override
    public void mostrarInterface() {

        Produtos[] produtos = Produtos.values(); // Vetor que todos os produtos da loja
        Carrinho carrinho = Carrinho.instancia();

        do { // Laço que mostra o menu de compras
            do { // Laço para o cliente informar qual categoria de produto deseja comprar
                System.out.println(Cores.ANSI_YELLOW_2 + "   \nBARATOSHOP" + Cores.ANSI_RESET);
                System.out.println(Cores.ANSI_BLUE_2 + """
!ESCOLHA UM SETOR!

[1] VEGETAIS [2] FRUTAS
[3] BISCOITOS [4] NÃO PERECÍVEL
[5] FINALIZAR COMPRAS""" + Cores.ANSI_RESET);

            System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
            decisaoCliente = Integer.parseInt(scanner.nextLine());
            System.out.println("");
            } while (decisaoCliente != 1 && decisaoCliente != 2 && decisaoCliente != 3 && decisaoCliente != 4 && decisaoCliente != 5); // Laço para o cliente informar qual categoria de produto deseja comprar

                switch (decisaoCliente){ // A partir do switch case, depedendo da opção passada pelo cliente, um setor será selecionado ou a seção de finalização de compras será iniciada. 
                    case 1:// Cliente quer ver os vegetais
                    System.out.println(Cores.ANSI_YELLOW_2 + "    VEGETAIS" + Cores.ANSI_RESET);
                        for (Produtos produto : produtos) {
                            if (produto.getSetor().equals("Vegetais")) {
                                System.out.println(produto);
                            }
                        }
                        break;
                    case 2:// Cliente quer ver as frutas
                        System.out.println(Cores.ANSI_YELLOW_2 + "    FRUTAS" + Cores.ANSI_RESET);
                        for (Produtos produto : produtos) {
                            if (produto.getSetor().equals("Frutas")) {
                                System.out.println(produto);
                            }
                        }
                        break;
                    case 3:// Cliente quer ver os biscoitos
                        System.out.println(Cores.ANSI_YELLOW_2 + "    BISCOITOS" + Cores.ANSI_RESET);
                        for (Produtos produto : produtos) {
                            if (produto.getSetor().equals("Biscoitos")) {
                                System.out.println(produto);
                            }
                        }
                        break;
                    case 4: // Cliente quer ver os não precíveis
                        System.out.println(Cores.ANSI_YELLOW_2 + "    NÃO PERECÍVEIS" + Cores.ANSI_RESET);
                        for (Produtos produto : produtos) {
                            if (produto.getSetor().equals("Basico")) {
                                System.out.println(produto);
                            }
                        }
                        break; 
                    case 5: // Cliente quer parar de adicionar produtos no carrinho
                    // scanner.close(); DANDO PROBLEMA NA INTERFACE SEGUINTE          
                    return; // Sai da seleção de setores e inicia a interface de finalização de compras.  
                }
                System.out.println(Cores.ANSI_GREEN_2 + "\nVocê deseja adicionar um produto no carrinho [1] - SIM | [2] - NÃO: " + Cores.ANSI_RESET);
                
                do { // Laço para saber se o cliente deseja adicionar algo no carrinho
                    System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
                    decisaoCliente = Integer.parseInt(scanner.nextLine());
                } while (decisaoCliente != 1 && decisaoCliente != 2); // Fim do laço para saber se o cliente deseja adicionar algo no carrinho
                
                if (decisaoCliente == 1) {
                    System.out.print(Cores.ANSI_YELLOW_2 + "Digite o id do produto [ID]" + Cores.ANSI_RESET);
                    int id = Integer.parseInt(scanner.nextLine());
                    for (Produtos produto : produtos) {
                        if (produto.getId() == id) {
                            carrinho.adicionarCarrinho(produto);
                        }
                    }
                } else {
                    continue;
                }
                
                
        } while (true); // Fim do laço que mostra o menu de compra
               
    }  
    
}
