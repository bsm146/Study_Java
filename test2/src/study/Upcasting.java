package study;

import java.util.ArrayList;
import java.util.List;

public class Upcasting {

    public static void main(String[] args) {

        // 다양한 객체들을 부모의 타입으로 관리할수 있음
        // 업캐스팅 안해도 부모의 타입으로 관리할수 있는거 같은데 뭐지?

        Animal animal = new Animal();
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        AnimalBark animalBark = new AnimalBark();
        List<Animal> listBark = new ArrayList<>();

        listBark.add(animal);
        listBark.add(animal1);
        listBark.add(animal2);

        for (Animal i : listBark) {
            animalBark.barkbark(i);
        }

        System.out.println("////////////////");

        Animal animal3 = new Animal();
        Dog animal4 = new Dog();
        Cat animal5 = new Cat();

        AnimalBark animalBark2 = new AnimalBark();
        List<Animal> listBark2 = new ArrayList<>();

        listBark2.add(animal3);
        listBark2.add(animal4);
        listBark2.add(animal5);

        for (Animal i : listBark2) {
            animalBark2.barkbark(i);
        }

    }
}

class Animal {

    public String print() {

        return "동물";
    }

    public String bark() {

        return "짖음";
    }

    public void animalMethod() {

        System.out.println("animalMethod");
    }
}

class Dog extends Animal {

    public String print() {

        return "강아지";
    }

    public String bark() {

        return "멍멍";
    }

    public String dog() {

        return "강아지는 멍멍";
    }
}

class Cat extends Animal {

    public String print() {

        return "고양이";
    }
    
    public String bark() {

        return "야옹";
    }
    
    public String cat() {

        return "고양이는 야옹";
    }
}

class AnimalBark {

    public void barkbark(Animal animal) {

        System.out.println(animal.print() + "이(가) " + animal.bark());
    }
}