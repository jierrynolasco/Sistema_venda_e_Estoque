import javax.management.modelmbean.DescriptorSupport;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema, o que vai querer gerenciar hoje?");
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Gerenciar Estoque");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        Scanner s = new Scanner(System.in);

        int opçao = s.nextInt();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;


        while (opcao != 3) {
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Cadastrar Cliente\n");


                System.out.println(" --------------- // ------------------");
                System.out.println("2. Gerenciar Estoque");
                System.out.println("3. Sair");

            } else if (opcao == 2) {
                System.out.println("Gerenciar Estoque\n");


                System.out.println(" --------------- // ------------------");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("3. Sair");
            } else if (opcao == 3) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
}

}