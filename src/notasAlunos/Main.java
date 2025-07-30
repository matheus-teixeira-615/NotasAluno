package notasAlunos;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<>();
		System.out.println("Cadatro dos alunos e suas notas: ");
		
		
		
		for (int i = 0; i <3; i++) {
			System.out.println("Nome do aluno: ");
			String nomeAluno1 = scanner.nextLine();
			
			
			System.out.println("Primeira nota do aluno: ");
			int nota1 = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Segunda nota do aluno: ");
			int nota2 = scanner.nextInt();
			scanner.nextLine();
			
			alunos.add(new Aluno(nomeAluno1, nota1, nota2));
			
			}
		
		for (int i =0; i <alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Nota 1: " + aluno.getNota1());
			System.out.println("Nota 2: " + aluno.getNota2());
			System.out.println("Média: " + aluno.Media());
			aluno.Aprovacao();
			System.out.println("----------------------------");
		}
		
		scanner.close();

	}

}
