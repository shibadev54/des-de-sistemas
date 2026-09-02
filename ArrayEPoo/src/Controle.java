import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    private String nome;
    private int nota1;
    private int nota2;
   Scanner read = new Scanner(System.in);
   ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
    public Controle(String nome, int nota1, int nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome, Scanner read) {
        System.out.println("insira seu nome");
        nome = read.nextLine();
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        System.out.println("insira sua nota");
        nota1 = read.nextInt();
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        System.out.println("insira sua outra nota");
        nota2 = read.nextInt();
    }
    public void setArray(String nome, int nota1, int nota2, Scanner read){
        Alunos.add(new Aluno(nome, nota1, nota2));
    }

}
