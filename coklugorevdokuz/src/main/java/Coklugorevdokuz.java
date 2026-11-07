import java.util.Scanner;

public class Coklugorevdokuz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
       
        System.out.println("Üçgenin üç kenar uzunluğunu giriniz:");
        System.out.print("Kenar 1: ");
      
        int a = input.nextInt();
        
        
        System.out.print("Kenar 2: ");
        int b = input.nextInt();
        
        System.out.print("Kenar 3: ");
        int c = input.nextInt();
        
        // Üçgen eşitsizliği kontrolü (doğrudan if içinde)
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
         
            System.out.println("Hata: Bu kenar uzunluklarıyla bir üçgen oluşturulamaz!");
        } else {
            if (a == b && b == c) {
        
                System.out.println("Bu  Eşkenar Üçgendir.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Bu  İkizkenar Üçgendir.");
            } else {
                System.out.println("Bu  Çeşitkenar Üçgendir.");
            }
        }
        
          
        
    }
}