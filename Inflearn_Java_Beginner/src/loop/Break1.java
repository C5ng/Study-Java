package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + 1;

            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료");
                System.out.println(sum);
                break;
            }

            i++;
        }
    }
}
