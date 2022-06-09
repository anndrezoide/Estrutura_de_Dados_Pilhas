package estruturadedados0905;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pilha p5 = new Pilha();
        int[]v = new int[5];
        
        int repete=0;
        for(int i=0; i<5; i++){
            System.out.print("Valor: ");
            p5.push(in.nextInt());    
        }
        for(int i=0; i<v.length; i++){
            v[i] = p5.pop();
        }
        for(int i=0; i<v.length; i++){
            for(int j=i+1; j<v.length; j++){
                if(v[j] == v[i]){
                    repete++;
                }
            }
            p5.push(v[i]);
        }
        System.out.println("-- SAIDA --");
        for(int i=0; i<5; i++){
            System.out.println(p5.pop());
        }     
        System.out.println("Qtd de número que se repete: " + repete);
    }
}
