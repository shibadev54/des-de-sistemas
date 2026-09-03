package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;


public class Controle {
    private String nome;
    private int nota1;
    private int nota2;
   private Scanner read = new Scanner(System.in);
public void Adicionar(){
    do{
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
        System.out.println("insira seu nome");
        nome = read.nextLine();
        this.nome=nome;
        if(nome.equals("fim")){
        break;}
        System.out.println("insira sua nota");
        nota1 = read.nextInt();
        this.nota1=nota1;
        if(nota1 < 0 || nota1 > 100){
        break;
        }
        System.out.println("insira sua outra nota");
        nota2 = read.nextInt();
        this.nota2 = nota2;
       if(nota2 < 0 || nota2 > 100){
        break;
        }
Alunos.add(new Aluno(nome, nota1, nota2));
}while(true);

}
public int Percorrer(Alunos){
    System.out.println("esses são os alunos");
for(Aluno A:Alunos){
        return this.Aluno;
}
}
}
