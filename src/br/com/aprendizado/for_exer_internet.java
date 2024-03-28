package br.com.aprendizado;

import java.util.Locale;
import java.util.Scanner;

public class for_exer_internet {
    public static void exercicio(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos você tem? ");
        int aluno = sc.nextInt();
        int medias = 6;
        double comeco = 0;

        for (int i = 1; i <= aluno; i++) {
            System.out.print("Nota do aluno número " + i + ": ");
            double notas = sc.nextDouble();

            notas = comeco + notas;
            comeco = notas;

            if (i == aluno) {
                notas = comeco;
                double media = notas/medias;
                System.out.println("Média: " + media);
            }

        }
    }
}
