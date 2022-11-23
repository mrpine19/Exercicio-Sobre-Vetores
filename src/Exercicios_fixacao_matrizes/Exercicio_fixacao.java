package Exercicios_fixacao_matrizes;

import java.util.Scanner;

public class Exercicio_fixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas que a matriz terá: ");
        int M = sc.nextInt();
        System.out.print("Digite a quantidade de colunas que a matriz terá: ");
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i=0;i<mat.length;i++){ //O mat.length PEGA O NÚMERO DE LINHAS DA MATRIZ
            for (int j=0;j<mat[i].length;j++){ //O mat[i].length PEGA O NÚMERO DE COLUNAS NA LINHA ESPECÍFICA
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o elemento que você deseja buscar: ");
        int num = sc.nextInt();

        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j] == num){
                    System.out.println("O número está na posição "+i+", "+j);
                    if (j-1 >= 0){
                        System.out.println("Esquerda: "+mat[i][j-1]);
                    }
                    if (j+1 < mat[i].length){
                        System.out.println("Direita: "+mat[i][j+1]);
                    }
                    if (i-1 >= 0) {
                        System.out.println("Cima: "+mat[i-1][j]);
                    }
                    if (i+1 < mat.length){
                        System.out.println("Baixo: "+mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
