package curso_progrmacaoJAVA;

public class ProcessData {

	public static void main(String[] args) {
		//Calcular a area de um trapesio
		
		double b, B, h, area;
		
		b= 6.0;
		B= 8.0;
		h= 5.0;
		
		area = (b+ B) / 2.0 * h;
		System.out.println(area);
		
		
		
		//Casting
		int castingA, castingB;
		double resultado;
		
		castingA = 5;
		castingB = 2;
		
		resultado = (double) castingA / castingB;
		
		System.out.println(resultado);
		
	}
	

}
