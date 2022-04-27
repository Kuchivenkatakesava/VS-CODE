package basics;

import java.time.LocalTime;
import java.time.ZoneId;

public class datatime {
    public static void main(String[] args) {

        System.out.println(LocalTime.now(ZoneId.of("US/Michigan")));
    }
}
