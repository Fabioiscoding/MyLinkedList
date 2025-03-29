public class MyLinkedList{
    private Nodo head;
    private int n_items;

    public MyLinkedList(){
        this.head = null;
        this.n_items = 0;
    }

    public void addfirst(int n){
        Nodo temp = this.head;
        this.head = new Nodo(n,temp);
        this.n_items++;
    }

    public void add(int pos, int n) {
        if (pos > n_items || pos < 0) {
            throw new IllegalArgumentException("Posizione non valida!!");
        }

        if (pos == 0) {
            head = new Nodo(n, head);
        } else {
            Nodo temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Nodo(n, temp.next);
        }
        n_items++;
    }

    public void removeFirst(){
        if (this.n_items == 0)
            throw new IllegalArgumentException("La dimensione della lista è 0!!");
        this.head = this.head.next;
        this.n_items--;
    }

    public void remove(int pos){
        if (pos > n_items || pos < 0) {
            throw new IllegalArgumentException("Posizione non valida!!");
        }

        if (pos == 0) {
            this.removeFirst();
        } else {
            Nodo temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        n_items--;
    }


    @Override
    public String toString(){
        String s = "";
        Nodo temp = head;
        while(temp != null){
            s += temp.info + " ";
            temp = temp.next;
        }
        return s;
    }
}