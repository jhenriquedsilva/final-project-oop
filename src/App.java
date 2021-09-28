import java.io.IOException;
import java.util.Scanner;

public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RED_2 = "\u001B[1;31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_GREEN_2 = "\u001B[1;32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_YELLOW_2 = "\u001B[1;33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_BLUE_2 = "\u001B[1;34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int decisaoCliente;
        System.out.println("\n" + ANSI_YELLOW_2 + "BEM-VINDO AO BARATOSHOP" + ANSI_RESET);

        System.out.println(ANSI_GREEN_2 + """
[1] Cliente
[2] Funcionário
[3] Sair
        """ + ANSI_RESET);
        System.out.print(ANSI_YELLOW_2 + "Selecionar: " + ANSI_RESET);
        decisaoCliente = input.nextInt();

        // ACHO QUE NÃO PRECISA DO TRY/CATCH porque o catch nunca será alcançado
        try {
            switch (decisaoCliente){
                case 1:
                InterfaceCliente interfaceDoCliente = new InterfaceCliente();
                break;
                case 2:
                InterfaceFuncionario interfaceDoFuncionario = new InterfaceFuncionario();
                break;
            }
        } catch (IOException e){
            System.out.println("Entrada invalida");
        }
        

        input.close();
    }
}
