package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] numbers;
    private int count;

    public int[] generate() {
        numbers = new int[6];
        count = 0;

        while (count < 6) {
            int number = random.nextInt(45) + 1;

            if (isUnique(number)) {
                numbers[count] = number;
                count++;
            }
        }

        return numbers;
    }

    private boolean isUnique(int number) {
        for (int i : numbers) {
            if (i == number) {
                return false;
            }
        }
        return true;
    }
}
