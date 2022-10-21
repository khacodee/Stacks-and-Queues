package Q1andQ2;

/**
 *
 * @author CaoKha
 */
public class MainQ2 {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        int numberElement2 = 8;
        mq.enqueue(2);
        mq.enqueue(4);
        mq.enqueue(6);
        mq.enqueue(7);
        mq.enqueue(8);
        mq.enqueue(10);
        System.out.println("Queue");
        System.out.print("1.Empty Queue? ");
        boolean check2 = mq.isEmpty();
        if (check2) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("No");
            mq.traverse();
        }
        System.out.println("\n2.Enqueue: ");
        mq.enqueue(9);
        mq.traverse();
        System.out.println("\n3. Dequeue: ");
        mq.dequeue();
        mq.traverse();
        System.out.print("\n4. First node: " + mq.first());
        System.out.println("5. Print All in the queue: ");
        mq.traverse();
        
        //Clear
        mq.clear();
        System.out.print("Queu after clear: ");
        mq.traverse();
    }
}
