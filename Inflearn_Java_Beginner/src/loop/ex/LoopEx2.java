package loop.ex;

public class LoopEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }


        int num2 = 2;
        for (int i = 1; i <= 10; i++) {
            // () 안에 조건, 증감 등 여러개 가능
            System.out.println(num2);
            num2 += 2;
        }
    }
}
