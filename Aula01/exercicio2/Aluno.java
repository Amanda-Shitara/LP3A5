package exercicio2;

public class Aluno extends Pessoa{
	private int matricula;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Aluno(String nome, int idade, int matricula) {
		super(nome, idade);
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}
	
	@Override
	public void apresentar() {
		System.out.println("Olá, eu sou o aluno " + nome + " com matrícula " + matricula + " e tenho " + idade + " anos");
	}

}
