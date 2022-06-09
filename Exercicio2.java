package estruturadedados0905;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pilha p2 = new Pilha();
        Pilha aux = new Pilha();
        
        String letra = "", x ="";
        
        for(int i=0; i<5; i++){
            System.out.print("Letra: ");
            letra = in.next(); 
            p2.push(letra);
        }
        
        aux.push(p2.pop());
        x = p2.pop();
        aux.push(p2.pop());
        p2.push(x);
        p2.push(aux.pop());
        p2.push(aux.pop());
        
        System.out.println("-- SAÍDA --");
        for(int i=0; i<5; i++){
            System.out.println(p2.pop());
        }
    }
}
