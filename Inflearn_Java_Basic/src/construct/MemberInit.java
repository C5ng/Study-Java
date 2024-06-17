package construct;

public class MemberInit {
    String name;
    int age;
    int grade;


    // 추가
    void initMember(String name, int age, int grade) {
        this.name = name; // Scope상 가까운 곳에 우선순위를 가진다. 즉 현재 코드에선 매개변수에 해당하는 변수들이 우선순위를 가져 사용된다.
        this.age = age; // this 사용 시 내 인스턴스의 변수를 뜻한다.
        this.grade = grade;
    }
}
