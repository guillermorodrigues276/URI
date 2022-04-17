import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();

        if(A<B && A<C && B<C){
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
            System.out.println("");
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        } 
        else if(A<C && A<B && C<B){
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);
            System.out.println("");
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        } 
        else if(B<A && B<C && A<C){
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);
            System.out.println("");
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        } 
        else if(B<A && B<C && C<A){
            System.out.println(B);
            System.out.println(C);
            System.out.println(A);
            System.out.println("");
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        } 
        else if(C<A && C<B && A<B){
            System.out.println(C);
            System.out.println(A);
            System.out.println(B);
            System.out.println("");
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        } 
        else if(C<A && C<B && B<A){
            System.out.println(C);
            System.out.println(B);
            System.out.println(A);
            System.out.println("");
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        }
    }
}