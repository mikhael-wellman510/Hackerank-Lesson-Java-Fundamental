package HackerRank.Queues;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Mikhael");
        queue.add("Deni");
        queue.add("Mukhlis");

        System.out.println(queue);
        queue.remove();

        System.out.println(queue);

        // Todo -> langsung nambah yang belakang nya
        queue.add("andi");
        System.out.println(queue);

        // Todo -> Ambil data yang depan
        String peek = queue.peek();
        System.out.println(peek);


        // Todo -> Mengurutkan berdasarkan alfabetis
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.add("mike");
        queue1.add("denis");
        queue1.add("rendi");
        queue1.add("mike");
        queue1.add("adelia");

        System.out.println(queue1);



    }
}
