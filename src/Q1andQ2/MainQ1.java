package Q1andQ2;

/**
 *
 * @author CaoKha
 */
public class MainQ1 {

    public static void main(String[] args) {

        //Q1
        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(3);
        ms.push(5);
        ms.push(7);
        ms.push(8);
        ms.push(9);
        ms.push(2);
        System.out.println("Stack");
        System.out.print("1.Empty Stack? ");
        boolean check1 = ms.isEmpty();
        if (check1) {
            System.out.println("Empty");
        } else {
            System.out.println("No");
            System.out.println("Create stack: ");
            ms.traverse();
        }

        System.out.println("\n2.Push 9 into stack: ");
        ms.push(9);
        ms.traverse();

        //Pop an element of stack
        ms.pop();
        System.out.println("\n3.Stack after pop a element");
        ms.traverse();

        System.out.println("\n4. Top Stack: " + ms.top());

        System.out.println("5. Print All in the stack: ");
        ms.traverse();
        System.out.println("\n6.Clear Stack: ");
        ms.clear();
        ms.traverse();
        System.out.println("--------------------------------");

    }
}
