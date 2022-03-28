import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();  
        double y1 = input.nextDouble(); 
        double x2 = input.nextDouble();    
        double y2 = input.nextDouble(); 
        
        double distanciaXY = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n", distanciaXY);

        input.close();
    
    }
}
