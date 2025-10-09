package CollectionInterface.ListPractice;

import java.util.ArrayList;
import java.util.List;

public class Listt {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        int x=list1.get(0);
        System.out.println(x);
        list1.set(0,9);
        System.out.println(list1.get(0));
        list1.add(2,25);
        System.out.println(list1.get(3));
        list1.remove(2);

        List smallist=new ArrayList<>();
        smallist=list1.subList(0,1);//add the elements from 0 to 1 of list1 to smallList


        //printing the list using the for each loop
        for(Integer i: list1){
            System.out.println(i);
        }
    }
}
