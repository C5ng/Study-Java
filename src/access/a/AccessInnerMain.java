package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가능
//        data.privateField = 3; // 불가능
//        data.privateMethod(); // 불가능

        data.innerAccess(); // 외부에서 innerAccess 호출 가능 -> innerAccess에서 내부 필드에 접근 가능
    }
}
