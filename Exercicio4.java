package estruturadedados0905;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pilha p4 = new Pilha();
        Pilha aux = new Pilha();
        Pilha aux2 = new Pilha();    
        
        String letra ="";
        for(int i=0; i<7; i++){
            System.out.print("Valor: ");
            letra = in.next();
            p4.push(letra);
        }
        aux.push(p4.pop());
        aux2.push(p4.pop());
        aux.push(p4.pop());
        aux2.push(p4.pop());
        aux.push(p4.pop());
        aux.push(p4.pop());
        aux2.push(p4.pop());
        
        p4.push(aux.pop());
        p4.push(aux.pop());
        p4.push(aux.pop());
        p4.push(aux.pop());
        p4.push(aux2.pop());
        p4.push(aux2.pop());
        p4.push(aux2.pop());        
        for(int i=0; i<7; i++){           
            System.out.println(p4.pop());
        }  
    }
}
