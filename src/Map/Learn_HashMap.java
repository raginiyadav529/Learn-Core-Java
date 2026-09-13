package Map;


import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Learn_HashMap {
    public static void main(String[]args){
        Map<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        System.out.println(map);
        if(!map.containsKey("Three")){
            map.put("Three",5);
        }
        map.putIfAbsent("Six",25);
        System.out.println(map);

        // *********** Iteration ***********
        for (Map.Entry<String,Integer> entry: map.entrySet()){

            System.out.println("key:value "+entry);
            System.out.println("key : "+entry.getKey());
            System.out.println("Value : "+entry.getValue());
        }

        for (String keys : map.keySet()){
            System.out.println("Key set : "+keys);
        }

        System.out.println(map.containsKey("Three"));
        System.out.println(map.containsValue(4));

        System.out.println("Empty : "+map.isEmpty());

        System.out.println(map.remove("Three"));
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}

// put -> value override
//putIfAbsent -> no value override if exist
