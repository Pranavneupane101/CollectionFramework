package CollectionInterface.ListPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {

        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("lemon");
        fruits.add("grapes");


        //Method1 for loop
        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

        //Method2 for each loop

        for(String fruit:fruits){
            System.out.println(fruit);
        }

        //Method3 Interator or ListIterator

        Iterator<String> fe=fruits.iterator();
        while (fe.hasNext()){
            System.out.println(fe.next());
        }


    }
}
