package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 0;

        if (dollar < 0) {
            System.out.println("금액 잘못 입력");
        } else if (dollar == 0) {
            System.out.println("금액 X");
        } else {
            System.out.println(dollar * 1300);
        }
    }
}
