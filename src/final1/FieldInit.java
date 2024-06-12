package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; // static fianl은 대문자로 작성하는 관례 == 상수
    final int value = 10;

    public FieldInit() {
        // 생성자를 통해 값 할당 불가
//        this.value = value;
    }
}
