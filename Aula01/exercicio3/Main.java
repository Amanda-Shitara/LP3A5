package exercicio3;

public class Main {
	public static void main(String[] args) {
		Circulo c = new Circulo(10);
		Triangulo t = new Triangulo(10,5);
		Quadrado q = new Quadrado(2.25);
		
		c.calcularArea();
		t.calcularArea();
		q.calcularArea();
	}
}
