package br.com.aprendizado.exerciciosPrimeiroModulo;

import java.util.Scanner;

public class exercicioTres {
    public static void exercicioNTres(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int diferenca;

        System.out.print("Primeiro valor: ");
        a = sc.nextInt();

        System.out.print("Segundo valor: ");
        b = sc.nextInt();

        System.out.print("Terceiro valor: ");
        c = sc.nextInt();

        System.out.print("Quarto valor: ");
        d = sc.nextInt();

        diferenca = (a * b - c * d);

        System.out.println(diferenca);
    }
}
