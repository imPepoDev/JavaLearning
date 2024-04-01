package br.com.aprendizado.exerciciosPrimeiroModulo;

import java.util.Locale;
import java.util.Scanner;

public class exercicioDois {
    public static void ExercicioDois(String args[]) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio;

        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        double formula = pi * Math.pow(raio, 2);

        System.out.printf("Resultado: %.4f", formula);
    }
}
