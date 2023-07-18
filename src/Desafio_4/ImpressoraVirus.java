package Desafio_4;

import java.util.Scanner;

public class ImpressoraVirus {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            String frase = leitorLinha(leitor);
            StringBuilder p1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder p2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
            System.out.println(" - ");
            p1.reverse();
            p2.reverse();
            System.out.println(p1.toString() + p2.toString());
        }
    }

    public static String leitorLinha(Scanner leitor) {
        String linha = leitor.nextLine();
        while (linha.isEmpty())
            linha = leitor.nextLine();
        return linha;
    }
}
