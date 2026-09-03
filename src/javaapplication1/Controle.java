package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    private String nome;
    private int nota1;
    private int nota2;
   private Scanner read = new Scanner(System.in);
   ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
public void Adicionar(){
    do{
        System.out.println("insira seu nome");
        nome = read.nextLine();
        if(nome.equals("fim")){
        break;}
        System.out.println("insira sua nota");
        nota1 = Integer.parseInt(read.nextInt());
        if(nota1 < 0 || nota1 > 100){
        break;
        }
        System.out.println("insira sua outra nota");
        nota2 = Integer.parseInt(read.nextInt());

       if(nota2 < 0 || nota2 > 100){
        break;
        }
        this.nome=nome;
        this.nota1=nota1;     
        this.nota2 = nota2;
Alunos.add(new Aluno(nome, nota1, nota2));
}while(true);

}
public void Percorrer(){
    System.out.println("esses sao os alunos e suas notas \n");
for(Aluno aluno:Alunos){
    System.out.println(aluno.getNome()+" " + (aluno.getNota1())+" " + (aluno.getNota2()));
}
}
public void Media(){
for(Aluno aluno:Alunos){
    System.out.println("essa é a media de: " + aluno.getNome());
    System.out.println((aluno.getNota1() + aluno.getNota2()) /2);
}
}
}
