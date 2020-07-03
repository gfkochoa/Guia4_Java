
public class Caso1 {

	public static void main(String[] args) {
		// Declaración del array
		String nombre[];
		nombre = new String[4];
		
		// Asignación de valores
		nombre[0] = "Gian";
		nombre[1] = "Norma";
		nombre[2] = "Sofia";
		nombre[3] = "Jorge";
		
		for (int i = 0; i <= 3; i++)
			System.out.println("Nombre " + (i + 1) + ": " + nombre[i]);
	}
}
