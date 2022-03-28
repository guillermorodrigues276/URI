import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numeroFuncionario = input.nextInt();
        int qtdHorasTrabalhadas = input.nextInt();
        double ValorHora = input.nextDouble();
        double salario = qtdHorasTrabalhadas * ValorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        input.close();
    }
}
