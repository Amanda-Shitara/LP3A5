package exercicio4;

public class Funcionario {
	protected String nome;
	protected double salario;
	protected String departamento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Funcionario(String nome, double salario, String departamento) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}

	public void mostrarInformacoes() {
		System.out.println("Nome:["+nome+"], Salário:["+salario+"], Departamento:["+departamento+"]");
	}
}
