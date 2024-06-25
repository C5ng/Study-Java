package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("localTime = " + localTime);

        // 계산
        LocalTime plus = localTime.plus(duration);
        System.out.println("plus = " + plus);

        // 시간 차이
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(10, 0);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("between = " + between.getSeconds());
        System.out.println("between.toHours() = " + between.toHours());
        System.out.println("between.toMinutes()i = " + between.toMinutes());
    }
}
