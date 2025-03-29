

public class Main {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.addfirst(1);
        l.addfirst(7);
        l.addfirst(3);
        l.add(2, 4);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
    }
}