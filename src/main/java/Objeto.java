import java.util.Scanner;

import lab3.revata.operaciones.Operacion3;

public class Objeto {

	
	
	
	private static Scanner s;

	public static void main(String[] args) {
		int opcion;
		s = new Scanner(System.in);
		System.out.println("Primer numero");
		Operacion3.a = s.nextDouble();
		System.out.println("Segundo numero");
		Operacion3.b = s.nextDouble();
		System.out.println("Operacion:\n1. Multiplicacion\n2. Division");
		opcion = s.nextInt();
		
		if(opcion==1)
			System.out.println("Resultado: " + Operacion3.multiplicacion());
		else if(opcion==2)
			System.out.println("Resultado: " + Operacion3.division());
		else
			System.out.println("No fokiu");
	}
	
}
