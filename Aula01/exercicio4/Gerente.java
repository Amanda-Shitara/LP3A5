package exercicio4;

public class Gerente extends Funcionario {
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Gerente(String nome, double salario, String departamento, String senha) {
		super(nome, salario, departamento);
		this.senha = senha;
	}

	@Override
	public void mostrarInformacoes() {
		System.out.println("Nome:["+nome+"], Salário:["+salario+"], Departamento:["+departamento+"], Senha:["+senha+"]");
	}
}
