package excecao2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);  
        do{
          System.out.println("esse código calcula a hipotenusa");
            System.out.println("digite um cateto");
        int c1 = write.nextInt();            
            System.out.println("digite outro cateto");
            int c2 = write.nextInt();
            //o método do triangulo vai retornar a hipotenusa
            System.out.println("deseja finalizar?");
            String resp = write.nextLine();
            if(resp == "sim"){ break;}
        }while(true);
    }
    
}
