package br.com.aprendizado;

import java.util.Locale;
import java.util.Scanner;

public class switch_ {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String dia;
        System.out.print("Digite um dia aleatório da semana: ");
        x = sc.nextInt();

        dia = "";

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Ter;a";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "This day is not valid.";
                break;

        }

        System.out.println(dia);

        sc.close();
    }

}
