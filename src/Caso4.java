import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] num;
		num = new Integer[5];
		
		for (int i = 0; i <= 4; i++) {
			System.out.print("Ingrese número " + (i + 1) + ": ");
			num[i] = sc.nextInt();
		}
		
		int n_par = 0, n_impar = 0, suma = 0;
		
		for (int x = 0; x <= 4; x++) {
			if (num[x]%2==0) {
				n_par += 1;
			} else {
				n_impar += 1;
			}
			
			suma += num[x];
		}
		
		float prom = suma / 5.0f;
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Cantidad de números pares: " + n_par);
		System.out.println("Cantidad de números impares: " + n_impar);
		System.out.println("Promedio de los números: " + prom);
	}
}
