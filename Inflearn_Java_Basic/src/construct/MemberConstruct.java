package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 도입
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " age: " + age + " grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 자기 자신 호출, 생성자 코드의 첫 줄에만 작성 가능하다.
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }
}
