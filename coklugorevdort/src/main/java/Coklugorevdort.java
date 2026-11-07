import java.util.Scanner;

public class Coklugorevdort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("üç farklı sayı giriniz:");
        System.out.print("1. Sayı= ");
        int s1 = input.nextInt();
        
        System.out.print("2. Sayı= ");
        int s2 = input.nextInt();
        
        System.out.print("3. Sayı= ");
        int s3 = input.nextInt();
        
        if (s1 >= s2 && s1 >= s3) {
            if (s1 == s2 && s1 == s3) {
                System.out.println("Girdiğiniz üç sayı da birbirine eşittir: " );
            } else if (s1 == s2) {
                System.out.println("En büyük sayılar 1. ve 2. sayıdır: " );
            } else if (s1 == s3) {
                System.out.println("En büyük sayılar 1. ve 3. sayıdır: "  );
            } else {
                System.out.println("En büyük sayı: " + s1);
            }
        } else if (s2 >= s1 && s2 >= s3) {
            if (s2 == s3) {
                System.out.println("En büyük sayılar 2. ve 3. sayıdır: " );
            } else {
                System.out.println("En büyük sayı: " );
            }
        } else {
            System.out.println("En büyük sayı: ");
        }
        
        
    }
}