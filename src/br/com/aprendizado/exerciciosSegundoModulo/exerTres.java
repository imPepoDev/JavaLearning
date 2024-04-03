package br.com.aprendizado.exerciciosSegundoModulo;

import java.util.Scanner;

public class exerTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("É multiplo");
        }

        else if (a % b != 0 || b % a != 0) {
            System.out.println("Não sou multiplos");
        }

    }
}
