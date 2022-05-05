package basics;

import java.util.HashMap;
import java.util.Map;

public class mapex {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); 
        System.out.println("Map is empty : " + map.isEmpty());

        map.put("kesava", 12345);
        map.put("kishore", 123);
        map.put("kesava", 999);

        System.out.println("Map is Empty : " + map.isEmpty());

        System.out.println("Key : kesava, Value : " + map.get("kesava"));
        System.out.println("Key : kishore, Value : " + map.get("kishore"));

        System.out.println("Key : kes is there ? " + map.containsKey("kes"));
        System.out.println("Value : 123 is there ? " + map.containsValue(123));

        map.remove("Arush");
        System.out.println("Key : kishore removed");

        map.put("sushmanth", 1234);

        map.forEach((k, v) -> {
            System.out.println("Key : " + k + ", value : " + v);
        });

    }
}
