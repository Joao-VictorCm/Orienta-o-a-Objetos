package curso_progrmacaoJAVA;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Para ler um texto ATÉ A QUEBRA DE LINHA
		
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x =sc.nextInt();
		sc.nextLine();       //Ira servir apenas para consumir a linha utilizada pelo nextInt()
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}

}
