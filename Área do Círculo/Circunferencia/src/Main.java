import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double raio = input.nextDouble();
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", + area);

        input.close();
    }
}