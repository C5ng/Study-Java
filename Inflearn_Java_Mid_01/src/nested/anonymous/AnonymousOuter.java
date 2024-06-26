package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;


        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void printer() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }; // 익명 클래스 생성과 선언

        printer.printer();
        System.out.println("printer = " + printer);
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(1);
    }
}
