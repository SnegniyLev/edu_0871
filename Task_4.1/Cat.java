public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
    }

    public boolean fight(Cat anotherCat) {

        int agePlus = this.age > anotherCat.age ? 1 : 0;
        int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
        int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

        int score = agePlus + weightPlus + strengthPlus;
        return score > 2;
    }

    public static void main(String[] args) {
        Cat cat1=new Cat(1,1,1);
        Cat cat2=new Cat(2,2,2);
        System.out.println(cat1.fight(cat2));
    }
}
