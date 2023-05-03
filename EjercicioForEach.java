public class EjercicioForEach {
	public static void main(String args[]) {
		
		int buscador = 3;
		int veces = 0;
		int arr[] = { 3, 276, 3, 134, 3, 85, 31 };

		for (int i : arr) {
			if (buscador != i) {
				System.out.println("Boca el mas grandee :D");
				continue;

			}
			veces++;

		}
		System.out.println("El numero " + buscador + " se repite " + veces + " vez(ces)");

	}

}