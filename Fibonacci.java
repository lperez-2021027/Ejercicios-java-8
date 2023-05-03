public class Fibonacci {
	public static void main(String args[]) {

		int x = 0;
		int y = 0;
		int limite = 10;
		int contador = 0;
		int z = 1;

		System.out.println(x);
		
		while (contador <= limite) {

			x = z;

			System.out.println(z);
			contador++;

			z = x + y;

			y = x;

		}

	}

}