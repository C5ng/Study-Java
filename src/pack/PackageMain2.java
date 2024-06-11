package pack;

import pack.a.User;
import pack.a.User2;
import pack.a.*; // 해당 패키지 내에 존재하는 모든 클래스를 읽어올 수 있다.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // 다른 패키지내에 존재하면 import를 선언하여 사용하면 된다.
        User2 user2 = new User2(); // user2 또한 import 해야한다.
    }
}
