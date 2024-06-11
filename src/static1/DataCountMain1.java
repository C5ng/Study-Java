package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);

        // 인스턴스를 생성 후 힙 영역 안에 있는 각자의 메모리 안에 저장하기 때문에 1, 1, 1 나온다 즉 독자적인 변수가 나온다.
    }
}
