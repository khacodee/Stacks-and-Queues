package Q3andQ4;

/**
 *
 * @author CaoKha
 */
public class MainQ4 {

    public static void main(String[] args) {

        // Question 4
        MyStack ms1 = new MyStack();
        String s3 = "This is Solution for Lab2";
        String sc1[] = s3.split("\\s+");
        for (int i = 0; i < sc1.length; i++) {
            ms1.push(sc1[i] + " ");
        }
        System.out.println("Q4:\n   ***STACK:");
        System.out.print("1.Empty Stack? ");
        boolean check3 = ms1.isEmpty();
        if (check3) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("No");
            ms1.traverse();
        }
        System.out.println("\n2.Push stack: ");
        ms1.push("PhongVT ");
        ms1.traverse();
        System.out.println("\n3. Pop Stack: ");
        ms1.pop();
        ms1.traverse();
        System.out.println("\n4. Top Stack: ");
        System.out.println(ms1.top());
        System.out.println("5. Print All in the stack: ");
        ms1.traverse();
        System.out.println("\n6.Clear Stack: ");
        ms1.clear();
        ms1.traverse();
        
        System.out.println("    ***QUEUE:");
        MyQueue mq1 = new MyQueue();
        String s4 = "Today is a beautiful day";
        String sc2[] = s4.split("\\s+");
        for (int i = 0; i < sc2.length; i++) {
            mq1.enqueue(sc2[i] + " ");
        }
        System.out.println("Queue");
        System.out.print("1.Queue is Empty: ");
        boolean check4 = mq1.isEmpty();
        if (check4) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("No");
            mq1.traverse();
        }
        System.out.println("\n2.Enqueue: ");
        mq1.enqueue(". Great!");
        mq1.traverse();
        System.out.println("\n3. Dequeue: ");
        mq1.dequeue();
        mq1.traverse();
        System.out.println("\n4. First node: ");
        System.out.println(mq1.first());
        System.out.println("5. Print All in the queue: ");
        mq1.traverse();
        System.out.println("\n6.Clear Queue: ");
        mq1.clear();
        mq1.traverse();
    }
}
