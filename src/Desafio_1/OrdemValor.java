package Desafio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdemValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Número de linhas de entrada
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        // Ler os valores de entrada e separar em listas de pares e ímpares
        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }
        // Ordenar os pares em ordem crescente
        Collections.sort(pares);

        // Ordenar os ímpares em ordem decrescente:
        Collections.sort(impares, Comparator.reverseOrder());

        // Imprimir os valores na ordem desejada:
        for (int par : pares) {
            System.out.println(par);
        }
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}
