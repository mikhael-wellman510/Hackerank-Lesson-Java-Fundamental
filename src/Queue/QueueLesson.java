package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLesson {
    public static void main(String[] args) {
        Queue<String> data = new LinkedList<>();
        data.add("mike");
        data.add("Deni");
        data.add("alma");

        System.out.println(data);
        data.remove();
        System.out.println(data);
        data.add("anjir");
        System.out.println(data);

        String cek = data.peek();
        System.out.println(cek);

        String pool = data.poll();
        System.out.println(pool);

        System.out.println(data);
    }
}
