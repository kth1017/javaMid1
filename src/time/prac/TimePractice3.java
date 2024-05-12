package time.prac;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimePractice3 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.HOURS);
        System.out.println("plusDt1 = " + plusDt1);

        LocalDateTime plusDt2 = dt.plusHours(10);
        System.out.println("plusDt2 = " + plusDt2);

        Duration duration = Duration.ofHours(10);
        LocalDateTime plusDt3 = dt.plus(duration);
        System.out.println("plusDt3 = " + plusDt3);
    }
}







