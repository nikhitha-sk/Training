// package DAY6;
import java.util.*;

public class DemoList {
    public static void main(String[] args){
        LinkedList buffer = new LinkedList();
        buffer.add("name");
        buffer.add(12);
        buffer.add(false);
        buffer.add(5.6);
        buffer.add('R');

        Queue<String> store = new PriorityQueue<>((a,b) -> b.compareTo(a));

        store.offer("spring boot");
        store.offer("Django");

        System.out.println(store);

        Iterator it = buffer.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
