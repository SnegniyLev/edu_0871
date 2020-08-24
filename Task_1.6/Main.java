import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        float a = scanner.nextFloat();
        double b = (a*1.15);
        System.out.println("Результат:"+b);
    }
}
