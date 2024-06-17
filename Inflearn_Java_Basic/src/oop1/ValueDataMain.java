package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();

        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("valueData.value = " + valueData.value);

        // valueData와 필요한 기능이 서로 분리되어 있다.
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
