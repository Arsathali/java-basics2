import java.util.Scanner;

public class ArithmeticMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r1 = a + b * c;
        int r2 = c + a / b;
        int r3 = a % b + c;
        int r4 = a * b + c;

        int max = r1;
        int min = r1;

        if (r2 > max) max = r2;
        if (r3 > max) max = r3;
        if (r4 > max) max = r4;

        if (r2 < min) min = r2;
        if (r3 < min) min = r3;
        if (r4 < min) min = r4;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }
}

