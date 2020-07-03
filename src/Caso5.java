import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] codigo = {"A001", "A018", "A123", "A555", "A357"};
		String[] nombre = {"Gian Ochoa", "Genaro Robles", "Nelson Barrera", "Ronald Velasquez", "Juan Mendoza"};
		int[] nota = {8, 15, 14, 10, 18};
		
		System.out.print("Ingrese código a buscar: ");
		String valor_codigo = sc.nextLine();
		
		int posicion = -1;
		
		for (int x = 0; x <= 4; x++) {
			// if (codigo[x].equals(valor_codigo))
			if (valor_codigo.equals(codigo[x])){
				posicion = x;
				break;
			}
		}
		
		if (posicion == -1) {
			System.out.println("Código no encontrado");
		}
		else {
			System.out.println("Código Encontrado");
			System.out.println("Nombre....: " + nombre[posicion]);
			System.out.println("Nota......: " + nota[posicion]);
			if (nota[posicion] >=11) {
				System.out.println("Estado: Aprobado");
			}
			else {
				System.out.println("Estado: Desaprobado");
			}
		}

	}

}
