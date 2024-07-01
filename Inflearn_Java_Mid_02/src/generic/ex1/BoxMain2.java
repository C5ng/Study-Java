package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer2 = (Integer) integerBox.getValue();
        System.out.println("integer2 = " + integer2);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue();
        System.out.println("str = " + str);

        // 잘못된 타입이 전달되었을 경우
        integerBox.setValue("문자100");
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);
    }
}
