public class CircularQueue<E> implements Queue<E>{

    private E[] q;
    private int front;
    private int rear;
    private int capacity = 1000;

    public CircularQueue(int capacity) {
        q = (E[]) new Object[capacity];
        this.capacity = capacity;
        rear = -1;
        front = 0;
    }

    public CircularQueue() {
        this(capacity);
        // this is to call the other constructor using default capacity
        // not good to have two of almost the same thing
    }

    public boolean isEmpty(){
        return(rear == -1);
    }

    public boolean isFull() {
        return ((rear != -1) && ((rear+1)%capacity == front));
    }

    public void enqueue(E o){
        if (o == null) {
            throw new NullPointerException("no null elements in the queue!");
        }
        if (isFull()) {
            throw new IllegalStateException("queue is full");
        }
        rear = (rear+1)%capacity;
        q[rear] = o;
    }

    public E dequeue(){
        if (isEmpty) {
            throw new IllegalStateException("queue is empty");
        }

        E val = q[front];
        q[front] = null;

        if (front == rear) {
            rear = -1;
            frount = 0;
        } else {
            front = (front+1)%capacity;
        }

        return val;
    }

    public String toString() {

        StringBuffer ans = new StringBuffer("[");
        Elem<T> cursor = front;

        if (!isEmpty()) {
            while(cursor != rear){
                ans.append(", " + q[cursor]);
                cursor = (cursor+1)%capacity;
            }
            ans.append("]");
            return ans.toString();
    }
}
