import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение температуры в градусах Цельсия:");
        float TC = scanner.nextFloat();
        float TF = ((9*TC/5)+32);
        System.out.println("Значение температуры в градусах по Фаренгейту:"+TF);
    }
}
