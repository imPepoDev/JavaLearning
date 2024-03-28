package br.com.aprendizado;

import java.util.Locale;



public class saidaDeDadosExer {
    public static void exercicioDados(String[] args) {


//        %f = ponto flutuante
//        %d = inteiro
//        %s = texto
//        %n = quebra de linha

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

//        System.out.printf("""
//
//                Products:
//                %s, which price is $ %.2f
//                %s, which price is $ $.2f
//
//                %nRecord: %d years old, code %d and gender: %s
//
//                Measue with eight decimal places: %f
//                Rouded (three decimal places): %.3f
//
//                """,
//                product1, price1, product2, price2,
//                age, code, gender,
//                measure, measure);

        System.out.printf("""
                Products:
                %s, which price is $ %.2f
                %s, which price is $ %.2f
                   
                Record: %d years old, code %d and gender: %s
                   
                Measue with eight decimal places: %f
                Rouded (three decimal places): %.3f
                """, product1, price1, product2, price2, age, code, gender, measure, measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);




    }
}
