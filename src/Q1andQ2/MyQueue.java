package Q1andQ2;

/**
 *
 * @author CaoKha
 */
public class MyQueue {

    Node head, tail;

    public MyQueue() {
        head = tail = null;
    }

    public void clear() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //addLast
    public void enqueue(Object info) {
        Node p = new Node(info);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object info = head.info;
        head = head.next;
        return info;
    }

    public Object first() {
        if (isEmpty()) {
            return null;
        }
        Object info = head.info;
        return info;
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Empty!");
        } else {
            Node p = head;
            while (p != null) {
                System.out.println(p.info);
                p = p.next;
            }
        }
    }
}
