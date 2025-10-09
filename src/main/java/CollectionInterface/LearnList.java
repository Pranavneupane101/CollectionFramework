package CollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();

        // Methods in the Collection Interface

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);




        System.out.println(list.isEmpty());// check if empty
        System.out.println(list.contains(20));// contains 20
        System.out.println(list.size());// size of collection
        list.remove(1);// remove by index
        list.remove(Integer.valueOf(1));// remove the value 1 if present.


        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list.addAll(list2);//add elements in list2 to list
        list.removeAll(list2);//remove the element present in the list2 from list. (A-B)
        list.retainAll(list2);// removes  the element present in the list2 and is not present in the list.(A)

        // converting the list to array
        Object a[]=list.toArray();

        for (Object e:a){
            Integer temp=(Integer)e;
            System.out.println(temp);
        }


    }
}
