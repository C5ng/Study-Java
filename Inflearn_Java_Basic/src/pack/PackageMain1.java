package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지 내에 존재
        pack.a.User user = new pack.a.User(); // 다른 패키지 내에 존재 -> 패키지를 포함하여 작성해야 한다.
    }
}
