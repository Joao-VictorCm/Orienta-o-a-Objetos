package membros_Estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.println("Circumference: " +c);
		System.out.println("Volume: " +v);
		System.out.println("PI value: " +Calculator.PI);

	}

}
