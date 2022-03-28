import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        int distanciaFornecida = input.nextInt();
        int qtdMinutos = (60 * distanciaFornecida) / 30;

        System.out.println(qtdMinutos + " minutos");

        input.close();
    }
}
