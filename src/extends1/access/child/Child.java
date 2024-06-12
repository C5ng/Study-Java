package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1; // 모두 가능
        protectedValue = 2; // 상속 관계 or 같은 패키지
//        defaultValue = 3; // 다른 패키지에서 접근 불가 -> compile error
//        privateValue = 4; // 해당 클래스 내부에서만 접근 가능 -> compile error

        publicMethod();
        protectedMethod();
//        defaultMethod(); compile error
//        privateMethod(); compile error

        printParent();
    }
}
