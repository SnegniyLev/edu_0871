import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Длина бассейна:");
        float a = scanner.nextFloat();
        System.out.println("Ширина бассейна:");
        float b = scanner.nextFloat();
        System.out.println("Высота бассейна:");
        float c = scanner.nextFloat();
        float V = (a*b*c*1000);
        System.out.println("Для заполнения бассейна до бортов нужно "+V+" литров воды");
    }
}
