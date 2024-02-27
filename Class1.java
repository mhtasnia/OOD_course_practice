import java.util.Scanner;

public class Class1 {
    public int max(int a, int b){
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A = ");
        int a = scan.nextInt();
        System.out.print("B = ");
        int b = scan.nextInt();

        Class1 obj = new Class1();
        System.out.println(obj.max(a, b));

    }
}
