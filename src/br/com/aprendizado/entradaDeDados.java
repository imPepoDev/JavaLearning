package br.com.aprendizado;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Usar isso OBRIGATORIAMENTE para que sc.nextDouble não tenha
        // que ser escrito no terminal com VIRGULA ( , ) e sim PONTO ( . )
        Locale.setDefault(Locale.US);

//        String x;
//        x = sc.next();
        // sc.nextDouble para números flutuantes
        // sc.nextInt para números inteiros
        // sc.nextDouble para números flutuantes e por ai vai...
        // digite sc. e veja as outras opções

//        System.out.println(x);

//        char x;
//        x = sc.next().charAt(0);

        // Caso declare uma váriavel CHAR (que suporta só 1 caracter)
        // Utilize depois do sc.next() o .charAt(0)
        // ele fará com que pegue apenas o PRIMEIRO caracter DIGITADO.
        // Exemplo: Você digitou "Your Name" ele vai capturar retornar "Y"

//        System.out.println(x);

        // Vários dados em uma só linha separado por espaços
        // Exemplo:
        // in console:
        // Maria 18 2.50
        // Retorna em cada print
        // Maria
        // 18
        // 2.50
//        String x;
//        int y;
//        double z;
//
//        x = sc.next();
//        y = sc.nextInt();
//        z = sc.nextDouble();
//
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);




//        Para ler um texto ATÉ A QUEBRA DE LINHA
//        Oque vai acontecer é simples, o programa vai ler a linha INTEIRA
//        esse feito será util para evitar o que foi feito no código anterior
//        onde todas as informações foram colocadas em uma linha só
//        sendo separadas apenas um espaço cada

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
