/**
 * Created by volfovskaya on 22.11.16.
 */
import java.util.*;
public class MyList {
    public static void main(String[] args) {
        LinkedList<Integer> my = new LinkedList<>();
        for (int i = 0; i <=10; i++) {
            my.add(i*10);
        }
        System.out.println("Выведем  связанный список "+my);
        System.out.println("Выведем первого "+my.getFirst());
        System.out.println("Выведем последнего "+my.getLast());

        my.addFirst(24);
        my.addLast(4);
        System.out.println("Выведем  связанный список "+my);

        my.remove(5);
        my.remove(10);
        System.out.println("Выведем  связанный список "+my);
    }
}