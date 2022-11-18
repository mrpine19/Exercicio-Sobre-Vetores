package Exercicios_fixacao_vetores.Altura;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double alturaTotal = 0.0;
        double menorDeIdade = 0.0;

        List <Pessoa> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            System.out.println("Dados da "+i+"ª pessoa ");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            if (idade < 16){
                menorDeIdade += 1;
            }
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            Pessoa pessoa = new Pessoa(name, idade, altura);
            list.add(pessoa);

            alturaTotal += pessoa.getAltura();
        }

        System.out.println();
        double mediaAltura = alturaTotal / n;
        System.out.printf("Altura média: %.2f\n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", menorDeIdade*100/n, "%");

        for (Pessoa pessoa : list){
            if (pessoa.getIdade() < 16){
                System.out.println(pessoa.getName());
            }
        }

        sc.close();
    }
}
