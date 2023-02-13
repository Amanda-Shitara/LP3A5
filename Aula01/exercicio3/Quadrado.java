package exercicio3;

public class Quadrado extends FormaGeometrica {
	
	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		double area = lado * lado;
		System.out.println("A área do quadrado é " + area);
	}

}
