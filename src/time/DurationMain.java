package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    // duration은 멤버로 초와 나노만 가지기에 단위 시간은 get 상위 시간은 to

    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        //계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한 시간: " + plusTime);

        //시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("차이: " + between.getSeconds() + "초");
        // minutesPart는 시간을 제외한 분(secondsPart는 없음)
        System.out.println("근무 시간: " + between.toHours() + "시간" + between.toMinutesPart() + "분");

    }
}
