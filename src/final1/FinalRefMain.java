package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // final 인스턴스 -> 한 번만 할당 가능하다.
//    data = new Data(); // compile error

        data.value = 10; // 참조 대상의 값은 변경 가능
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
