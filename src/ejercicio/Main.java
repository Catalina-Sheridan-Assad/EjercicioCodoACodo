package ejercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new  Scanner(System.in);

		System.out.println("Ingrese su nombre");
		String nombre = scan.nextLine();
		System.out.println("Ingrese su apellido");
		String apellido = scan.nextLine();
		System.out.println("Ingrese su edad");
		String edad = scan.nextLine();
		System.out.println("Ingrese su hobbie");
		String hobbie = scan.nextLine();
		System.out.println("Ingrese su editor de código preferido");
		String editor = scan.nextLine();
		System.out.println("Ingrese el sistema operativo que utiliza");
		String sistema = scan.nextLine();
		
		System.out.println("nombre: " + nombre + "\napellido: " + apellido + "\nedad: " + edad + "\nhobbie: " + hobbie + "\neditor de código preferido: " + editor +
				"\nsistema operativo que utiliza: " + sistema);
	}

}
