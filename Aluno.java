package entities;
public class Aluno {
String nome;
 String Cursos;
 String [] disciplinas = new String[3];
 double[][] nota = new double [3][4];



 boolean aprovado(int indice) {
	 double soma=0;
	 for(int i=0;i<nota[indice].length;i++) {
		 soma +=	 nota[indice][i];
		 
	 }
	 
	 double media = soma/4;
	 
	 if(media>7) {
		 return true;
		 
	 }
	 return false;
	 
	 
 }



}


