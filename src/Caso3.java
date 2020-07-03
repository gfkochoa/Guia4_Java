import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// int, float, double     -> Tipos datos primititvo o base
		// Integer, Float, Double -> Tipo de datos colecci�n (objetos)
		
		Integer[] num;
		num = new Integer[5];
		
		for (int i = 0; i <= 4; i++) {
			System.out.print("Ingrese n�mero " + (i + 1) + ": ");
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num); // Ordenamiento ascendente
		
		System.out.println("Lista en orden ASCENDENTE");
		System.out.println("=========================");
		for (int i = 0; i <= 4; i++)
			System.out.println("N�mero " + (i + 1) + ": " + num[i]);
		
		Arrays.sort(num, Collections.reverseOrder()); // Ordenamiento descendente
		
		System.out.println("Lista en orden DESCENDENTE");
		System.out.println("=========================");
		for (int i = 0; i <= 4; i++)
			System.out.println("N�mero " + (i + 1) + ": " + num[i]);
	}
}
