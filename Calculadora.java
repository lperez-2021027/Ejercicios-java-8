public class Calculadora{
	public static void main (String args[]){
	
	char simbolo='*';
	int num1=20;
	int num2=10;
	int total=0;
		
		if (simbolo=='+'){
			total=num1+num2;
				System.out.println("El resultado de la suma es: "+total);
		}
		else if (simbolo=='-'){
			total=num1-num2;
			System.out.println("El resultado de la resta es: "+total);
		}
		else if (simbolo=='*'){
			total=num1*num2;
			System.out.println("El resultado de la multiplicacion es: " +total);
		}
		else if (num2==0){
			System.out.println("Introduzca valor valido");
		}
		else{ 
			total=num1/num2;
			System.out.println("El resultado de la division es: " +total);
		}
		
	}


}