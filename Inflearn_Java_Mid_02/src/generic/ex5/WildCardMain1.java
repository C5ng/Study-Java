package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildCardV1(dogBox);

        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildCardV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("냥냥이", 200));
        Cat cat = WildCardEx.printAndReturnGeneric(catBox);

        Animal animal = WildCardEx.printAndReturnWildCard(dogBox); // 와일드카드를 사용하면 무조건 상한으로 리턴된다. 즉 여기선 Animal로 return 된다.

    }
}
