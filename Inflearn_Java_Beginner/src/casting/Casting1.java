package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int to long
        System.out.println(longValue);

        doubleValue = intValue; // int to double
        System.out.println(doubleValue);

        doubleValue = 2000L; // long to double
        System.out.println(doubleValue);
        
    }
}
