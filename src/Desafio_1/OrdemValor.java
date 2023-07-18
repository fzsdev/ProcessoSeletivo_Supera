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

/*
Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo o seguinte critério:
• Primeiro os Pares
• Depois os Ímpares Sendo que deverão ser apresentados os pares em ordem crescente e
depois os ímpares em ordem decrescente.

Entrada A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105)
 Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada uma delas,
 um valor inteiro não negativo.

Saída Apresente todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo abaixo.


Exemplo de Entrada

10
4
32
34
543
3456
654
567
87
6789
98

Exemplo de Saída
4
32
34
98
654
3456
6789
567
543
87

*/