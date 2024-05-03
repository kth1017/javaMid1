package time;

import java.time.*;

public class ZonedDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 30);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt = " + zdt1);

        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("zdt2 = " + zdt2);
    }
}
