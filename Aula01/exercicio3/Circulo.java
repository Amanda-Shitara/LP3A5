package exercicio3;

public class Circulo extends FormaGeometrica {

	private double raio;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public void calcularArea() {
		double area = Math.PI * raio * raio;
		System.out.println("A área do círculo é " + area);
	}

}
