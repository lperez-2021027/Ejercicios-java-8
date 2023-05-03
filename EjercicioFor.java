public class EjercicioFor {
	public static void main(String args[]) {
		int x;
		int tabla = 7;
		int limite = 30;
		int limit = 10;
		int total = 0;

		System.out.println("contar de 2 en 2");

		for (x = 0; x <= 100; x = x + 2) {
			System.out.println(x);
		}

		x = 0;
		System.out.println("Contar 3 en 3");

		for (x = 0; x <= limite; x = x + 3) {
			System.out.println(x);
		}

		x = 0;
		System.out.println("tabla de multiplicar del " + tabla);

		for (x = 0; x <= limit; x++) {
			total = tabla * x;
			System.out.println(tabla + " * " + x + "=" + total);
		}

	}

}