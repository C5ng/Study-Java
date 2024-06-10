package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); // () 안에는 생성자를 뜻한다. 즉 기본 생성자에 필요한 매개변수를 던져줘야한다.
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("name = " + member.name + " age: " + member.age + " grade: " + member.grade);
        }
    }
}
