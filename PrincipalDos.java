public class PrincipalDos {
	public static void main(String args[]) {
		// Enunciado decision
		int x = 10;

		if ((x >= 0) && (x <= 10)) {
			// se pueden anidar if (if dentro de if)
			System.out.println("Esta en el rango de 10");
			if (x == 7) {
				System.out.print("El valor es 7");
			} else {
				System.out.print("El valor es diferente de 7");
			}
		}

		else if (x <= 100) {
			// no existe else sin if
			System.out.println("no esta en el rango de 10");
			System.out.println("El valor es menor de 100");
		} else {
			System.out.println("El valor es mayor de 100");
		}

	}

}