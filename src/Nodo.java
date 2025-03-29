public class Nodo {
    Nodo next;
    int info;

    public Nodo(int n){
        this.info = n;
        this.next = null;
    }

    public Nodo(int n, Nodo next){
        this.info = n;
        this.next = next;
    }

    @Override
    public String toString(){
        return "" + info;
    }
}