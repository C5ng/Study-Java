package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        AuthGrade authGrade = AuthGrade.valueOf(sc.nextLine());

        System.out.println("당신의 등급은: " + authGrade.getDescription() + " 회원입니다.");
        printMenu(authGrade);
    }

    private static void printMenu(AuthGrade authGrade) {
        System.out.println("== 메뉴 목록 ==");
        System.out.println("- 메인 화면 - ");

        if (authGrade == AuthGrade.LOGIN) {
            System.out.println("- 이메일 관리 화면 - ");
        } else if (authGrade == AuthGrade.ADMIN) {
            System.out.println("- 이메일 관리 화면 - ");
            System.out.println("- 관리자 화면 - ");
        }
    }
}
