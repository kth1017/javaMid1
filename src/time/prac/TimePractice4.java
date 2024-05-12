package time.prac;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class TimePractice4 {
    public static void main(String[] args) {
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println("odt = " + odt);

        ZoneOffset offset = ZoneOffset.ofHours(9);
        OffsetDateTime odt2 = OffsetDateTime.now(offset);
        System.out.println("odt2 = " + odt2);
    }
}






