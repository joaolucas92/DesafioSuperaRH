package segundoDesafio;

import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor monetário: ");
        String valorString = scanner.nextLine();
        float valor = Float.parseFloat(valorString);

        int notas100 = (int) (valor / 100);
        valor %= 100;
        int notas50 = (int) (valor / 50);
        valor %= 50;
        int notas20 = (int) (valor / 20);
        valor %= 20;
        int notas10 = (int) (valor / 10);
        valor %= 10;
        int notas5 = (int) (valor / 5);
        valor %= 5;
        int notas2 = (int) (valor / 2);
        valor %= 2;

        int moedas1r = (int) (valor / 1);
        valor %= 1;
        int moedas50 = (int) (valor / 0.5);
        valor %= 0.5;
        int moedas25 = (int) (valor / 0.25);
        valor %= 0.25;
        int moedas10 = (int) (valor / 0.10);
        valor %= 0.10;
        int moedas5 = (int) (valor / 0.05);
        valor %= 0.05;
        int moedas1 = (int) (valor / 0.01);
        
        System.out.println("Quantidade de notas:");
        System.out.println(notas100 + " notas de R$ 100,00.");
        System.out.println(notas50 + " notas de R$ 50,00.");
        System.out.println(notas20 + " notas de R$ 20,00.");
        System.out.println(notas10 + " notas de R$ 10,00.");
        System.out.println(notas5 + " notas de R$ 5,00.");
        System.out.println(notas2 + " notas de R$ 2,00.");
        
        System.out.println("Quantidade de moedas:");
        System.out.println(moedas1r + " moedas de R$ 1,00.");
        System.out.println(moedas50 + " moedas de R$ 0,50.");
        System.out.println(moedas25 + " moedas de R$ 0,25.");
        System.out.println(moedas10 + " moedas de R$ 0,10.");
        System.out.println(moedas5 + " moedas de R$ 0,05.");
        System.out.println(moedas1 + " moedas de R$ 0,01.");

        scanner.close();
	}

}
