package excecao;
import java.util.Scanner;
public class idade {
    void inserirIdade (){
 Scanner read = new Scanner(System.in);
 try{
System.out.println("insira sua idade");
int idade = read.nextInt();
if(idade > 120){
throw new IllegalArgumentException("você é velho");
}
 }catch(IllegalArgumentException e){
     System.err.println("deu ruim " + e.getMessage());
 }
}
}
