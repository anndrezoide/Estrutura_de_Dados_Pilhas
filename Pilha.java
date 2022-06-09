package estruturadedados0905;
public class Pilha {
    int[] v = new int[5];
    int topo = -1;
    
    public void push(int valor){
        topo++;
        v[topo] = valor;
    }
    public int pop(){
        int aux = v[topo];
        topo--;
        return aux;
    }
    public int seek(){
        return v[topo];
    }
}
