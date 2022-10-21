package Q3andQ4;

/**
 *
 * @author CaoKha
 */
public class MainQ3 {

    public static void main(String[] args) {

        // Question 3
        MyStack ms = new MyStack();
        String s1 = "PhanSyTrong";
        for (int i = 0; i <= s1.length() - 1; i++) {
            ms.push(s1.charAt(i));
        }

        System.out.println("Q3:\n   ***STACK:");
        System.out.print("1.Empty stack? ");
        boolean check1 = ms.isEmpty();
        if (check1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("No");
            ms.traverse();
        }

        System.out.println("\n2.Push stack: ");
        ms.push("20-04-2002");
        ms.traverse();

        System.out.println("\n3. Pop Stack: ");
        ms.pop();
        ms.traverse();

        System.out.println("\n4. Top Stack: ");
        System.out.println(ms.top());
        System.out.println("5. Print All in the stack: ");
        ms.traverse();
        System.out.println("6.Clear Stack: ");
        ms.clear();
        ms.traverse();

        /// Queue ////
        System.out.println("    ***QUEUE");
        MyQueue mq = new MyQueue();
        String s2 = "PhanSyTrong";
        for (int i = 0; i <= s2.length() - 1; i++) {
            mq.enqueue(s2.charAt(i));
        }

        System.out.print("1.Empty Queue? ");
        boolean check2 = mq.isEmpty();
        if (check2) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("No");
            mq.traverse();
        }
        System.out.println("\n2.Enqueue: ");
        mq.enqueue("20-04-2002");
        mq.traverse();
        System.out.println("\n3. Dequeue: ");
        mq.dequeue();
        mq.traverse();
        System.out.println("\n4. First node: ");
        System.out.println(mq.first());
        System.out.println("5. Print All in the queue: ");
        mq.traverse();
        mq.clear();
        System.out.println("\n6.Clear Queue: ");
        mq.traverse();
        System.out.println("\n-------------------------------------------");

    }
}
