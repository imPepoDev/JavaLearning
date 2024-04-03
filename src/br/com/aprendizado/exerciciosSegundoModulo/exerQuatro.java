package br.com.aprendizado.exerciciosSegundoModulo;

import java.util.Locale;
import java.util.Scanner;

public class exerQuatro {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo;
        int qntdd;

        codigo = sc.nextInt();
        qntdd  = sc.nextInt();

        double total;

        if (codigo == 1) {
            total = (double) qntdd * 4;
            System.out.printf("Total: %.2f", total);
        }

        else if (codigo == 2) {
            total = (double) qntdd * 4.50;
            System.out.printf("Total: %.2f", total);
        }
        else if (codigo == 3) {
            total = (double) qntdd * 5;
            System.out.printf("Total: %.2f", total);
        }
        else if (codigo == 4) {
            total = (double) qntdd * 2;
            System.out.printf("Total: %.2f", total);
        }
        else if (codigo == 5) {
            total = (double) qntdd * 1.50;
            System.out.printf("Total: %.2f", total);
        }

        sc.close();
    }
}
