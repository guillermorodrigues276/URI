import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int totalHrs = 0;
        if(A == B){
            totalHrs = 24;
        }
        else if(A > B){
            totalHrs = 24 - A;
            totalHrs = totalHrs + B;
        }
        else{
            totalHrs = B - A;
        }

        System.out.println("O JOGO DUROU "+ totalHrs +" HORA(S)");
    }
}
