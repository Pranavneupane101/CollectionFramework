package CollectionInterface.MapPractice;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(10,"Pranav");
        map.put(81,"Shyama");
        map.put(96,"Ustarga");
        map.putIfAbsent(100,"Pranish");
        System.out.println(map.get(100));//
        map.remove(10);

        for(Integer x:map.keySet()){
            System.out.println(x);
        }
        for(String name:map.values()){
            System.out.println(name);
        }


    }
}
