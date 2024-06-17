package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentsName = {"학생 1", "학생 2"};
        int[] studentsAge = {15, 16};
        int[] studentsGrade = {90, 80};

        for (int i = 0; i < studentsName.length; i++) {
            System.out.println("studentName = " + studentsName[i] + " 나이: " + studentsAge[i] + " 성적: " + studentsGrade[i]);
        }

        // 학생에 대한 정보(데이터)가 나눠져 있음. 이걸 하나로 관리하면 편리하고 코드도 줄어드는 장점
    }
}
