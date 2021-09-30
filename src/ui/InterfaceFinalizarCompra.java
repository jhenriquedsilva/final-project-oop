package ui;
import produtos.Produtos;
import recursos.Cores;
import java.util.Scanner;
import java.util.ArrayList;
import produtos.Carrinho;


public class InterfaceFinalizarCompra implements Interface {
    private Carrinho carrinho = Carrinho.instancia();
    private Scanner scanner = new Scanner(System.in); 
    private int decisaoCliente;



    @Override
    public void mostrarInterface() {
        do {
            System.out.println(Cores.ANSI_YELLOW_2 + "   \n    BARATOSHOP" + Cores.ANSI_RESET);

            System.out.println(Cores.ANSI_WHITE_2 + "   \nITENS NO CARRINHO" + Cores.ANSI_RESET);
            carrinho.mostrarProdutosNoCarrinho();
            System.out.println(Cores.ANSI_RED_2 + "[TOTAL] = " + carrinho.calcularTotal() + "" + Cores.ANSI_RESET);
            
            System.out.println(Cores.ANSI_GREEN_2 + "\nVocê deseja alterar algum produto [1] - SIM | [2] - NÃO: " + Cores.ANSI_RESET);
                    
            do { // Laço para saber se o cliente quer modificar o carrinho
                System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
                decisaoCliente = Integer.parseInt(scanner.nextLine());
            } while(decisaoCliente != 1 && decisaoCliente != 2); // Fim do laço para saber se o cliente quer modificar o carrinho

            if (decisaoCliente == 1) { // O cliente decidiu alterar o carrinho
                System.out.println(Cores.ANSI_GREEN_2 + "\nVocê deseja [1] - REMOVER PRODUTO | [2] - ALTERAR QUANTIDADE DO PRODUTO: " + Cores.ANSI_RESET);
                    
                do { // Saber se o cliente quer remover ou alterar aa quantidade de um produto
                    System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
                    decisaoCliente = Integer.parseInt(scanner.nextLine());
                } while(decisaoCliente != 1 && decisaoCliente != 2); 

                if (decisaoCliente == 1) { // O cliente quer remover um produto
                    int id;
                    do {
                        carrinho.mostrarProdutosNoCarrinho();
                        System.out.println(Cores.ANSI_GREEN_2 + "\nDigite o id do produto: " + Cores.ANSI_RESET);
                        id = Integer.parseInt(scanner.nextLine());
                    } while (!carrinho.getIds().contains(id));

                    carrinho.removerDoCarrinho(id);

                } else { // O cliente quer alterar a quantidade do produto                
                    int id;
                    do {
                        carrinho.mostrarProdutosNoCarrinho();
                        System.out.println(Cores.ANSI_GREEN_2 + "\nDigite o id do produto: " + Cores.ANSI_RESET);
                        id = Integer.parseInt(scanner.nextLine());
                    } while (!carrinho.getIds().contains(id));    

                    int novaQtd;
                    do {
                        System.out.println(Cores.ANSI_GREEN_2 + "\n Digite a nova quantidade do produto: " + Cores.ANSI_RESET);
                        novaQtd = Integer.parseInt(scanner.nextLine());
                    } while (novaQtd <= 0);
                    carrinho.buscarProduto(id).setQtd(novaQtd);
                    
                }

            } else { // Cliente não quer alterar nenhum produto no carrinho
                System.out.println(Cores.ANSI_GREEN_2 + "\nVocê deseja [1] - REALIZAR PEDIDO | [2] - DESISTIR DA COMPRA: " + Cores.ANSI_RESET);
                do { // Saber se o cliente quer fazer o pedido ou descartar o pedido.
                    System.out.print(Cores.ANSI_YELLOW_2 + "Selecionar: " + Cores.ANSI_RESET);
                    decisaoCliente = Integer.parseInt(scanner.nextLine());
                } while(decisaoCliente != 1 && decisaoCliente != 2); 
                if (decisaoCliente == 1){
                    System.out.println(Cores.ANSI_WHITE_2 + "PEDIDO REALIZADO COM SUCESSO!" + Cores.ANSI_RESET);
                    return;
                }else{
                    System.out.println(Cores.ANSI_RED_2 + "PEDIDO DESCARTADO!" + Cores.ANSI_RESET);
                    return;
                }
                
            }
        }while(true);
    }    
}
