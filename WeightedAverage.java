// Calcular a média ponderada de 3 notas por aluno (com pesos 2, 4 e 4) e informar se cada aluno foi aprovado ou reprovado com base na média final.

package javaapplication;

import java.util.Scanner;

public class Media_Ponderada {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
      int peso1 = 2, peso2 = 4, peso3 = 4;
       
      
        for (int i = 1; i <= 10; i++) {
            System.out.println("Aluno " + i);
            
            System.out.print("Digite a primeira nota: ");
            double nota1 = e.nextDouble();
            
            System.out.print("Digite a segunda nota: ");
            double nota2 = e.nextDouble();
            
            System.out.print("Digite a terceira nota: ");
            double nota3 = e.nextDouble();
            
            
            double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
            
            System.out.printf("A MEDIA FINAL DE ALUNO %d FOI %.2f\n", i, media);
            
            if (media >= 7.0) {
                System.out.printf("\n***APROVADO***\n");
            } else {
                System.out.printf("\n***REPROVADO***\n");
            }
            
            System.out.println();
        }
    }
}
