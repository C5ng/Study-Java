package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); // 같은 클래스 명이면 해당 클래스의 주소(패키지)를 다 적어줘야 한다.
        // 자주 사용하는 클래스를 import
    }
}
