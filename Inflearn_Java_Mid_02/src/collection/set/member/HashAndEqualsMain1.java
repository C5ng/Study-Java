package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(5);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode()); // 참조값
        System.out.println("m2.hashCode() = " + m2.hashCode()); // 참조값
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // 참조값을 비교하니 false

        set.add(m1);
        set.add(m2);
        System.out.println(set); // 서로 다르게 들어간다.

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
