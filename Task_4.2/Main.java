public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse nibblesMouse = new Mouse("Nibbles", 8, 3);
        Cat tomCat = new Cat("Tom", 5, "grey");
        Cat bootchCat = new Cat("Bootch", 7, "black");
        Dog spykeDog = new Dog("Spyke", "bulldog", "grey");
    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
class Cat {
    String name;
    int age;
    String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
class Dog {
    String name;
    String breed;
    String color;

    public Dog(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }
}
