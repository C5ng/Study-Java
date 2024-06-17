package static1;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++; // static 변수 Data3 내부에선 Data3.count -> count로 생략 가능
    }
}
