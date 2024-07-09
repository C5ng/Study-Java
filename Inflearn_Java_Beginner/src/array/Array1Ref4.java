package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열 생성과 초기화

        // 변수 값 대입

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 " + (i + 1) + " 점수: " + students[i]);
        }
//        System.out.println("학생 1 점수: " + students[0]);
//        System.out.println("학생 2 점수: " + students[1]);
//        System.out.println("학생 3 점수: " + students[2]);
//        System.out.println("학생 4 점수: " + students[3]);
//        System.out.println("학생 5 점수: " + students[4]);
    }
}
