package estruturadedados0905;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pilha p1 = new Pilha();
        
        int num=0;
        for(int i=0; i<5; i++){
            System.out.print("Valor: ");
            p1.push(in.nextInt());
        }
        System.out.println("-- SAÍDA --");
        for(int i=0; i<5; i++){
            System.out.println(p1.pop());
        }   
    }
}
