package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 Enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name: " + value.name() + " ordinal: " + value.ordinal()); // Value 명과 순서
        }

        // String -> ENUM 변환
        String input = "GOLD"; // 존재하지 않는 값을 넣으면 IllegalArgumentException 발생
        Grade grade = Grade.valueOf(input);
        System.out.println("grade = " + grade);

        
    }
}
