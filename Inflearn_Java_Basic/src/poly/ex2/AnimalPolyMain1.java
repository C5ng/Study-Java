package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        // 오버라이딩 된 메서드가 우선권을 갖는다.
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 을음 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
