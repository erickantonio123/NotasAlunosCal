package entities;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno");
		aluno.nome = in.next();
		
		System.out.println("Digite o curso");
		aluno.Cursos = in.next();
		
		for(int i=0; i<aluno.disciplinas.length;i++) {
			System.out.println(" Digite a primeira " +(i+1) + " Disciplina"  );
			aluno.disciplinas[i]= in.next();
		}
		for(int i =0 ; i<aluno.nota.length;i++) {
			System.out.println("Digite a nota a " + (i+1) + " Nota " );
			for(int j=0;j<aluno.nota[i].length;j++) {
				
				aluno.nota[i][j] = in.nextDouble();
				
			}
		}
		
		for(int i =0; i<aluno.nota.length;i++) {
			if(aluno.aprovado(i)) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
		}


	}

}
