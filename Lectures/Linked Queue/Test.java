public class Test {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        for (int i = 0; i<10; i++){
            queue.enqueue(i);
        }
        System.out.println(queue);
    }
}
