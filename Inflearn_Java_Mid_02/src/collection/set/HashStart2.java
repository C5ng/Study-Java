package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));
        // 데아터의 값을 인덱스의 값으로 사용한다.

        int searchValue = 8; // O(1)
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
