package CollectionInterface.Queue;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> arrayd=new ArrayDeque<>();
        arrayd.offerFirst(1);
        arrayd.offerFirst(2);
        arrayd.offerLast(3);
        arrayd.offerLast(4);
        for(Integer a : arrayd){
            System.out.println(a);
        }

        System.out.println(arrayd.pollFirst());
        System.out.println(arrayd.pollLast());
        System.out.println(arrayd.peekFirst());
        System.out.println(arrayd.peekLast());


    }

}
