package br.com.aprendizado;

public class processamentoDados {
    public static void processamento(String args[]) {

//        Jeito ERRADO:
//        int a, b;
//        double resultado;
//
//        a = 5;
//        b = 2;
//
//        resultado = a / b;
//        Retorna 2.0

//        Jeito CORRETO:
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b; // Adicionar (double)
        System.out.println(resultado);

    }
}
