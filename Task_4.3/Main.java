public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Star", 5, "black");
        Pegasus pegasus = new Pegasus("Sky", 7, "grey");
        horse.run();
        pegasus.fly();
    }
}
abstract class Animal {
    protected String nickname;
    protected int age;
    protected String color;

    public Animal(String nickname, int age, String color) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}
class Horse extends Animal{
    public Horse(String nickname, int age, String color) {
        super(nickname, age, color);
    }
    void run(){
        System.out.println("Игого, я поскакал(а)");
    }
}
class Pegasus extends Horse{
    public Pegasus(String nickname, int age, String color) {
        super(nickname, age, color);
    }
    void fly(){
        System.out.println("Игого, я полетел(а)");
    }
}
