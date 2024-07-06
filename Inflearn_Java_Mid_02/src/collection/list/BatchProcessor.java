package collection.list;

public class BatchProcessor {
    // private final MyArrayList<Integer> list = new MyArrayList<>(); // 직접적으로 의존하지 않는다.

    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    } // 의존관계 주입

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
