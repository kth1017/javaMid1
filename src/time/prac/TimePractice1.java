package time.prac;

import java.time.Instant;
import java.time.ZonedDateTime;

public class TimePractice1 {

    public static void main(String[] args) {
        // 멤버를 보면 초와 나노초만 포함 / 출력은 년월일로
        //생성
        Instant now = Instant.now();//UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}