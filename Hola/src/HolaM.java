import java.util.Scanner;

public class HolaM {
	public static void main(String args[]) {
		System.out.println("Hola");
		
		Scanner consola = new Scanner(System.in);
		
		String nombre;
		nombre=consola.nextLine();
		
		System.out.println("Hola "+ nombre);
		
	}
}
