import java.util.Scanner;

public class VowelOrConsonantSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println("Consonant...");
                } else {
                    System.out.println("Invalid input....");
                }
        }
    }
}
