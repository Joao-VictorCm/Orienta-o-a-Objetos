package Estrutura_Condicional;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int horas;
		System.out.println("Quantas horas??");
		horas = sc.nextInt();

		if (horas <= 12) {
			System.out.println("Bom dia");
		} else if (horas > 12 && horas <= 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();

	}

}
