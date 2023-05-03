public class EjercicioEnClaseTres {

	public static void main(String args[]) {
		// variables:
		int x = 0;
		int numero;
		int numero2;
		int total;
		char simbolo = '+';
		numero = 10;
		numero2 = 40;
		total = numero + numero2;
		// declarando variable con cadena de caracteres
		String nombre = "Luis";
		String apellido = "Perez";
		String unionVariables = null;
		unionVariables = nombre + " " + apellido;

		System.out.println("total= " + total);
		System.out.println("el simbolo es: " + simbolo);
		System.out.println("Mi nombre es: " + unionVariables);
		System.out.println("Antes de operar x=x+1 " + x);
		x = x + 1;
		System.out.println("Despes de operar " + x);
		// operar con ++
		x++;
		System.out.println("Despes de operar con ++ " + x);
	}

}