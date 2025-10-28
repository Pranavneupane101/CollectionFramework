package CollectionInterface.Queue;

import java.util.ArrayDeque;

public class StackAndQueueUsingArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(5);
        /*It is better the normal Stack because the normal Stack class implements Vector
        which is used in multi threads to Synchronize the operations. That makes it very
        slow compare to the stack operation using the Deque.
        */

    }
}
