package generic.test.ex1;

public class Pair<T1, T2> {
    private T1 valueT1;
    private T2 valueT2;

    public void setFirst(T1 valueT1) {
        this.valueT1 = valueT1;
    }

    public void setSecond(T2 valueT2) {
        this.valueT2 = valueT2;
    }

    public T1 getFirst() {
        return valueT1;
    }

    public T2 getSecond() {
        return valueT2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "valueT1=" + valueT1 +
                ", valueT2=" + valueT2 +
                '}';
    }
}
