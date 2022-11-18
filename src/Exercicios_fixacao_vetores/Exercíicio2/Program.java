package Exercicios_fixacao_vetores.Exercíicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("VALORES: ");

        double soma = 0.0;
        for (int i=0; i<n; i++){
            System.out.printf("%.1f ", vector[i]);
            soma += vector[i];
        }

        System.out.println();
        System.out.printf("SOMA: %.2f", soma);
        System.out.println();
        System.out.printf("MEDIA: %.2f", soma/n);

        sc.close();
    }
}
