package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println("C");
                break;
            case "D":
                System.out.println("D");
                break;
            case "F":
                System.out.println("F");
                break;
            default:
                System.out.println("X");
        }
    }
}
