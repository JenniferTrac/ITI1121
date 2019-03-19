public class SinglyLinkedList<E>{
// this code is so broken
    private static class Node<E> {
        private E value;
        private Node<E> next;
        private Node(E value, Node<E> next){
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;

    public SinglyLinkedList() {
        head = null;
    }

    public void addFirst(E o) {

        if (o==null) {
            throw new NullPointerException("no nulls!");
        }

        Node<E> tmp = new Node<E>(o,null);

        if (head == null) {
            head = tmp;
        } else {
            tmp.next = head;
            head = tmp;
        }

    }

    public void addFirstAlternative(E o) {
        if(o==null) {
            throw new NullPointerException("no nulls!");
        }
        head = new Node<E>(o, head);
        // ^^^ this does the exact same thing as addFirst(E o)
    }

    public void add(E o) {
        if(o==null) {
            throw new NullPointerException("no nulls!");
        }
        Node<E> tmp = head;
        if(head == null) {
            head = new Node<E>(o,null);
        } else {
            while(tmp.next != null) {
                tmp = tmp.next;
            }
        tmp.next = new Node<E>(o,null);
        }
    }

    public E removeFirst() {
        if(head==null){
            throw new IllegalStateException("list is empty!");
        }
        E tmp = head.value;
        head = head.next;
        return tmp;
    }

    public E removeLast() {
        if(head == null){
            throw new IllegalStateException("list is empty!");
        }
        E val;
        if(head.next == null){
            val = head.value;
            head = null;
            return val;
        }
        Node<E> tmp = head;
        while(tmp.next.next!=null){
            tmp = tmp.next;
        }
        val = tmp.next.value;
        tmp.next = null;
        return val;
    }

    public boolean remove(E o) {
        //very very broken here
        if(o==null){
            return false;
        }
        if(head == null){
            return false;
        }
        Node<E> tmp = head;
        if(tmp.next==null){
            if(tmp.value.equals(o)) {
                head=null;
                return true;
            } else {
                return false;
            }
        } else {
            while(tmp.next.next!=null){
                if(tmp.value.equals(o)) {
                    tmp.next = tmp.next.next;
                    return true;
                }
                tmp = tmp.next;
            }
        }
        return false;
    }
}
