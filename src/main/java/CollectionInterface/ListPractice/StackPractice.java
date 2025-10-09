package CollectionInterface.ListPractice;


import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack<String> stacks = new Stack<>();
        stacks.push("A");
        stacks.push("B");
        stacks.push("C");
        stacks.push("D");
        stacks.push("E");

        System.out.println(stacks.pop());
        System.out.println(stacks.peek());
        System.out.println(stacks.isEmpty());






    }
}
