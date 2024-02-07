import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        //PriorityQueue using min-heap method arransing data
        PriorityQueue pq=new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(40);
        pq.add(19);
        System.out.println(pq);
    }
}
