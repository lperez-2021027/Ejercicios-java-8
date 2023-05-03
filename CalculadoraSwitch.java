public class CalculadoraSwitch {
	public static void main(String args[]) {

		System.out.println("Intriduzca el simbolo \"+\" para realizar una suma");
		System.out.println("Intriduzca el simbolo \"-\" para realizar una resta");
		System.out.println("Intriduzca el simbolo \"*\" para realizar una multipicacion");
		System.out.println("Intriduzca el simbolo \"/\" para realizar una division");
		char option = '+';
		int num1 = 10;
		int num2 = 20;
		int total = 0;
		switch (option) {
			case '+':
				total = num1 + num2;
				System.out.println("El resultado de la suma es: " + total);
				break;
			case '-':
				total = num1 - num2;
				System.out.println("El resultado de la resta es: " + total);
				break;
			case '*':
				total = num1 * num2;
				System.out.println("El resultado de la multiplicacion es: " + total);
				break;
			case '/':
				if (num2 == 0) {
					System.out.println("Valor no valido");
				} else {
					total = num1 / num2;
					System.out.println("El resultado de la division es: " + total);

				}
				break;
			default:
				System.out.println("Opcion no valida");
		}

	}

}