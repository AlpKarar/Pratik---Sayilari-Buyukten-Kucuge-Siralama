import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("a: ");
        a = input.nextInt();
        
        System.out.print("b: ");
        b = input.nextInt();
        
        System.out.print("c: ");
        c = input.nextInt();
        
        if (b < a && c < a) {
            if (c < b) {
                System.out.print("c < b < a");
            }else {
                System.out.print("b < c < a");
            }
        } else if (a < b && c < b) {
            if (c < a) {
                System.out.print("c < a < b");
            }else {
                System.out.print("a < c < b");
            }
        } else {
            if (b < a) {
                System.out.print("b < a < c");
            }else {
                System.out.print("a < b < c");
            }
        }
    }
}
