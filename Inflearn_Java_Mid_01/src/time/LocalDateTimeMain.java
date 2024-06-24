package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println("now = " + now);
        System.out.println("localDateTime = " + localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        // 날짜와 시간 분리
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime1 = " + localDateTime1);

        // 계산 불변
        LocalDateTime localDateTime2 = localDateTime.plusDays(1000);
        System.out.println("localDateTime2 = " + localDateTime2);
        LocalDateTime localDateTime3 = localDateTime2.plusYears(1);
        System.out.println("localDateTime3 = " + localDateTime3);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가: " + now.isBefore(localDateTime));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가: " + now.isAfter(localDateTime));
        System.out.println("현재 날짜 시간과 지정 날짜 시간이 같은가: " + now.isEqual(localDateTime));
    }
}
