package Fucao_Strings;

import java.util.Scanner;

public class funcao_sintaxe {

	public static void main(String[] args) {
		// Fazer um programa para ler três numeros inteiros e mostrar na tela o maior deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higer = max(a,b, c);
		
		showResult(higer);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > x && y > z) {
			aux = y;
		}else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higer: "+value);
	}

}
 