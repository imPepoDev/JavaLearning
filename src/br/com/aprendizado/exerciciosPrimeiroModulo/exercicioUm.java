package br.com.aprendizado.exerciciosPrimeiroModulo;
import java.util.Scanner;
import java.util.Locale;

public class exercicioUm {
    public static void exericicoUm(String args[]) {
        Locale.setDefault(Locale.US);
        int a;
        int b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        a = sc.nextInt();
        System.out.print("Segundo número: ");
        b = sc.nextInt();

        c = (double) a + b;

        System.out.printf("Resultado: %.1f", c);


    }
}
