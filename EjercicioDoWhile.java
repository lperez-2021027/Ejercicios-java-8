public class EjercicioDoWhile {
	public static void main(String args[]) {
		int x = 0;
		int tabla = 10;
		int limit = 10;
		int limite = 30;
		int total = 0;

		System.out.print("Contador 2 en 2");

		do {
			System.out.println(x);
			x = x + 2;
		} while (x < 100);

		System.out.println("Contador de 3 en 3");
		x = 0;

		do {
			System.out.println(x);
			x = x + 3;
		} while (x <= limite);

		System.out.println("tablas de multiplicar");
		x = 0;

		do {
			x++;
			total = tabla * x;
			System.out.println(tabla + " * " + x + "=" + total);
		} while (x <= limit);

	}

}