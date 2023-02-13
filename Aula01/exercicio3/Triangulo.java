package exercicio3;

public class Triangulo extends FormaGeometrica {

	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		double area = (base * altura)/2;
		System.out.println("A área do triângulo é " + area);
	}

}
