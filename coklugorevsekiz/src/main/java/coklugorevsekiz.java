import java.util.Scanner;

public class coklugorevsekiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Sayı ");
        double s1 = input.nextDouble();
        
        System.out.print("2. Sayı ");
        double s2 = input.nextDouble();
        
        System.out.print("İşlem seçin (+, -, *, /): ");
        char islem = input.next().charAt(0);
        
        switch (islem) {
            case '+':
                System.out.println("Sonuç: " + (s1 + s2));
                break;
            case '-':
                System.out.println("Sonuç: " + (s1 - s2));
                break;
            case '*':
                System.out.println("Sonuç: " + (s1 * s2));
                break;
            case '/':
                if (s2 == 0) {
                    System.out.println("Sıfıra bölünemez");
                } else {
                    System.out.println("Sonuç: " + (s1 / s2));
                }
                break;
            default:
                System.out.println("Geçersiz işlem");
        }
        
        
    }
}