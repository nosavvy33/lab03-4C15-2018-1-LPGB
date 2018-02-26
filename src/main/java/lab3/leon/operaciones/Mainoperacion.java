package lab3.leon.operaciones;
import java.util.Scanner;
import lab3.leon.operaciones.Operacion;
public class Mainoperacion {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		Operacion op = new Operacion();
		System.out.println("Ingrese valor de x");
		int x = s.nextInt();
		System.out.println("Ingrese valor de y");
		int y = s.nextInt();
		op.setX(x);
		op.setY(y);
		System.out.println("Suma : "+op.Suma()+"\nResta : "+op.Resta());
	}

}
