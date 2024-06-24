package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜: " + now);
        System.out.println("지정 날짜: " + localDate);

        // 불변
        LocalDate localDate1 = localDate.plusDays(10); // 반환값 받아야 한다.
        System.out.println("날짜: " + localDate1);
    }
}
