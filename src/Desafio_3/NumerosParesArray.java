package Desafio_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumerosParesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Tamanho do array
        int k = scanner.nextInt(); // Valor alvo

        int[] arr = new int[n]; // Array de inteiros
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifferenceK(arr, k);
        System.out.println(count);
    }

    public static int countPairsWithDifferenceK(int[] arr, int k) {
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Contagem da frequência dos elementos
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Verificação dos pares que satisfazem a diferença k
        for (int num : arr) {
            int complement = num - k;
            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }
        }

        return count;
    }
}
