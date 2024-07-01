package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>(); // 생성 시점의 T의 타입 결정
        integerGenericBox.set(10);
//        integerGenericBox.set("문자 100"); // Integer 타입만 허용, 컴파일 에러
        Integer integer = integerGenericBox.get(); // 캐스팅 할 필요 X
        System.out.println("integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("hello");
//        stringGenericBox.set(10); // String 타입만 허용, 컴파일 에러
        String str = stringGenericBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(10.5);
        Double v = doubleGenericBox.get();
        System.out.println("v = " + v);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerGenericBox1 = new GenericBox<>();
    }
}
