// Gerar e exibir a tabuada de um número digitado pelo usuário, em formato de tabela organizada.

import java.util.Scanner;

public class TabuadaEmTabela {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y;

        System.out.print("Digite um número para ver sua tabuada: ");
        Y = scanner.nextInt();

        System.out.printf("\nTABUADA DO %d\n", Y);
        System.out.println("===========================");
        System.out.printf("| %-5s | %-8s |\n", "X", "Resultado");
        System.out.println("===========================");

        for (int X = 1; X <= 10; X++) {
            System.out.printf("| %-5d | %-8d |\n", X, X * Y);
        }

        System.out.println("===========================");
    }
}
