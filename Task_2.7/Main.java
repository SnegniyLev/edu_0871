public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = ((number-number%100)/100)+((number%100-number%10)/10)+(number%10);
        return sum;
    }
}
