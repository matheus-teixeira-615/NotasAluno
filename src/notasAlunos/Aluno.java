package notasAlunos;

public class Aluno {
	String nome;
	int nota1;
	int nota2;
	
	public Aluno(String nome, int nota1, int nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public double Media() {
		int resultado = (nota1 + nota2) / 2;
		return resultado;
	}
	
	public void Aprovacao() {
		if (Media() >= 6 ) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
	}
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	
	
	
}
