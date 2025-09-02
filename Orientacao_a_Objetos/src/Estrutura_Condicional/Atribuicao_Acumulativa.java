package Estrutura_Condicional;

public class Atribuicao_Acumulativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minutos = 153;

		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
			
			System.out.println("valor da conta " +conta);
		}

	}

}
