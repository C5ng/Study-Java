package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버의 접근
            System.out.println("nestedInstanceValue = " + nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에는 접근 불가
            // static은 메서드 영역에, instance는 instance 영역에 생기기 때문에 접근 불가.
//            System.out.println("outInstanceValue = " + outInstanceValue);
            
            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println("NestedOuter.outClassValue = " + NestedOuter.outClassValue);
        }
    }
}
