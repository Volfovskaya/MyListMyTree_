/**
 * Created by volfovskaya on 23.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Node root = new Node(10);

        Node el1 = new Node(4);
        root.add(el1);
        root.add(new Node(7));
        root.add(new Node(2));
        root.add(new Node(9));
        root.add(new Node(5));
        root.add(new Node(1));
        root.add(new Node(3));
        root.add(new Node(13));
        root.add(new Node(23));
        root.add(new Node(35));
        root.add(new Node(19));
        root.add(new Node(11));
        root.print();
    }
}
