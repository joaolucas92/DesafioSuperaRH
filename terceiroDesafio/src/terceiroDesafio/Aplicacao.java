package terceiroDesafio;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do array: ");
	    int n = scanner.nextInt();
	    
	    int[] arr = new int[n];
	    System.out.println("Informe os elementos do array:");
	    for (int i = 0; i < n; i++) {
	        arr[i] = scanner.nextInt();
	    }
	    
		System.out.print("Informe o valor do alvo: ");
		int k = scanner.nextInt();
		
		int count = countPairsWithTargetDifference(arr, k);

	    System.out.println("Número de pares com diferença igual a " + k + ": " + count);
		
		scanner.close();
	}

	private static int countPairsWithTargetDifference(int[] arr, int k) {
		int count = 0;
	    Map<Integer, Integer> numCounts = new HashMap<>();
	    
	    for (int num : arr) {
	        numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
	    }

	    for (int num : arr) {
	        int diff1 = num - k;
	        int diff2 = num + k;

	        if ((diff1 != num && numCounts.containsKey(diff1)) ||
	                (diff2 != num && numCounts.containsKey(diff2))) {
	            count++;
	        }
	    }

	    return count / 2;
	}

}
