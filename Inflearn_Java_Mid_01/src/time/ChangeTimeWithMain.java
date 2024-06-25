package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime with = localDateTime.with(ChronoField.YEAR, 2020);
        System.out.println("with = " + with); // 새롭게 만드는 것

        LocalDateTime localDateTime1 = localDateTime.withYear(2020);
        System.out.println("localDateTime1 = " + localDateTime1);

        // TemporalAdjuster 사용
        // 다음주 금요일
        LocalDateTime with1 = localDateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜 localDateTime = " + localDateTime);
        System.out.println("다음 금요일 with1 = " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = localDateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println("같은 달의 마지막 금요일 with2 = " + with2);
    }
}
