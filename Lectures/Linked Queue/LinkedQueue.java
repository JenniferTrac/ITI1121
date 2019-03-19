public class LinkedQueue<T> implements Queue<T> {

    private static class Elem<T> {
        private T value;
        private Elem<T> next;
        private Elem(T value, Elem<T> next){
            this.value = value;
            this.next = next;
        }
    }

    /*for this implementation, we will use:
    A -> B -> C -> D -> null
    the items were added in the order (A, B, C, D)
    This means that to dequeue, we will be taking A
    and to enqueue, we will be putting Elem E where null is
    We will also need references front and rear for quick access
    */

    private Elem<T> front;
    private Elem<T> rear;

    public LinkedQueue() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return rear == null;
    }

    public void enqueue(T newElement) {

        // We cannot have null elements in the queue
        if(newElement == null){
            throw new NullPointerException("No null references in my queue!");
        }

        Elem<T> temp = new Elem<T>(newElement, null);

        if(isEmpty()){
            front = temp;
            rear = temp;
        } else {
            rear.next = temp;
            rear = rear.next;
        }
    }

    public T dequeue() {

        if(isEmpty()){
            throw new IllegalStateException("you cant dequeue if queue is empty");
        }

        T result;
        result = front.value;

        if(front.next == null){
            // this is to check if front was the last elements
            // so when we remove the last element, we basically "reset" the queue
            front = rear = null;
        } else {
            front = front.next;
        }

        return result;
    }

    public String toString() {

        StringBuffer ans = new StringBuffer("[");
        Elem<T> cursor = front;

        while(cursor != null){
            ans.append(cursor.value);
            if (cursor.next != null) {
                ans.append(", ");
            }
            cursor = cursor.next;
        }
        ans.append("]");
        return ans.toString();
    }

}
