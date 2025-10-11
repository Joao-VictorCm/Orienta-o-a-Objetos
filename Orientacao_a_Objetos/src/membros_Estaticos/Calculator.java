package membros_Estaticos;

public class Calculator {
	
	public static final double PI = 3.14159;  //se nomeia tudo em maisculo quando é constante
	//aonde não irar ser alterado o valor e se coloca o "...final..." 
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
		
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
