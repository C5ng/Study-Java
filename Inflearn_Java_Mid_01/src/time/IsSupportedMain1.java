package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);

        if (supported) {
            System.out.println("now = " + now.get(ChronoField.SECOND_OF_MINUTE));
        }

//        System.out.println("now = " + now.get(ChronoField.SECOND_OF_MINUTE)); // LocalDate는 시 분 초는 존재 X, UnsupportedTemporalTypeException


    }
}
