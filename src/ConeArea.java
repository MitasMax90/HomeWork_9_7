import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class ConeArea {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите радиус конуса: ");
            int radius = in.nextInt();
            System.out.print("Введите высоту конуса: ");
            int height = in.nextInt();
            double l = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
            long area = Math.round(Math.PI * Math.pow(radius, 2) + Math.PI * radius * l);
            System.out.printf("Площадь конуса с радиусом %d и высотой %d равна: %d \n", radius, height, area);
        } catch (InputMismatchException e) {
            System.out.println("Необходимо ввести число!");
        }
    }
}
