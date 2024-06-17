package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // this 생략 가능하다. Scope상 우선순위에 있는 변수를 찾는다.
    }
}
