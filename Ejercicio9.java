
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String args[])  {

		Scanner scanner = new Scanner(System.in);

		int contador;
		double promedio;
		int sumat;
		int t1;
		int t2;
		do {
			System.out.println("Ingrese la primer temperatura:");
			t1  = scanner.nextInt();
			if (t1!=0) {
				System.out.println("Ingrese la segunda temperatura:");
				t2  = scanner.nextInt();
				sumat = 0;
				contador = 0;
				if (t1<=15 && t1>=5) {
					sumat = sumat+t1;
					contador = contador+1;
				}
				if (t2<=15 && t2>=5) {
					sumat = sumat+t2;
					contador = contador+1;
				}
				if (contador>0) {
					promedio = sumat/contador;
					System.out.println("Promedio: "+promedio);
				} else {
					System.out.println("Temperaturas fuera de rango [5,15]");
				}
			}
		} while (t1!=0);
	}


}

