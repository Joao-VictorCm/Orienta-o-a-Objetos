package curso_progrmacaoJAVA;

import java.util.Locale;
import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Digitou: " +x);
		sc.close();
		
		
		
		//Para ler um número inteiro(int)
		Scanner scInt = new Scanner(System.in);
		int exInt;
		exInt = scInt.nextInt();
		System.out.println("Seu numero digitado foi: " +exInt);
		scInt.close();
		
		
	
		/*Para ler um número com casas dps da virgula (Double)
		Neste caso usaria o . pois esta na localidade do US
		
		Locale.setDefault(Locale.US);
		Scanner sdouble = new Scanner(System.in);
		double exDouble;
		exDouble = sdouble.nextDouble();
		System.out.println("Seu numero digitado foi: " +exDouble);
		sdouble.close();
		
	
        //Para ler apenas um caracter (neste caso o primeiro pois foi definido com 0)
		Scanner sc = new Scanner(System.in);
		char xchar;
		xchar = sc.next().charAt(0);
		
		System.out.println("Você digitou: "+ xchar);		
		sc.close();*/
		
		//Para ler varios dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
		tle
	}

}
