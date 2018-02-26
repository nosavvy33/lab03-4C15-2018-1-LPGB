package lab3.leon.operaciones;

public class Operacion {

	int x;
	int y;
	
	public Operacion (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Operacion() {
		
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int Suma() {
		return this.x+this.y;
	}
	
	public int Resta() {
		return this.x-this.y;
	}
	
}
