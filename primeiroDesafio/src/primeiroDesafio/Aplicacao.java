package primeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número de entradas: ");
        int num = scanner.nextInt();
	        if (num <= 0) {
	        	System.out.println("Número de entradas inválido!");
	        	return;
	        }
        
		List<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite " + num + " valores inteiros positivos:");
        for (int i = 0; i < num; i++) {
        	System.out.println("Valor " + (i + 1) +": ");
        	int valor = scanner.nextInt();
        	while (valor < 0) {
        		System.out.println("O número deve ser positivo e inteiro!");
        		valor = scanner.nextInt();
        	}
        	numeros.add(valor);
        }
        
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int x : numeros) {
            if (x % 2 == 0) {
                pares.add(x);
            } else {
                impares.add(x);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());
        
        for (int par : pares) {
            System.out.println(par);
        }

        for (int impar : impares) {
            System.out.println(impar);
        }
        
        scanner.close();

	}

}
