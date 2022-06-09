package estruturadedados0905;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pilha p3 = new Pilha();
        Pilha aux = new Pilha();
        Pilha aux2 = new Pilha();

        int retirarValor=0;

        for(int i=0; i<5; i++){
            System.out.print("Valor: ");
            p3.push(in.nextInt());
        }
        
        System.out.print("Digite o valor que deseja retirar: ");
        retirarValor = in.nextInt();
        
        for(int i=0; i<5; i++){
            if(p3.seek() != retirarValor){
                aux.push(p3.pop());
            }else{
                aux2.push(p3.pop());
            }
        }
        for(int i=0; i<4; i++){
            System.out.println(aux.pop());
        }
    }
}
