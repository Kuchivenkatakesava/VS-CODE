package core;

import java.util.HashSet;
import java.util.Set;

public class setex {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        s.add(100);
        s.add(200);
        s.add(300);

        s.add(100);


        s.remove(200);

        s.forEach(System.out::println);

    }
}
