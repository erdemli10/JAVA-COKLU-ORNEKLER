import java.util.Scanner;

public class Coklugorevyedi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        
        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println(sayi + " sayısı hem 3'e hem de 5'e tam bölünmektedir.");
        } else if (sayi % 3 == 0) {
            System.out.println(sayi + " sayısı sadece 3'e tam bölünmektedir.");
        } else if (sayi % 5 == 0) {
            System.out.println(sayi + " sayısı sadece 5'e tam bölünmektedir.");
        } else {
            System.out.println(sayi + " sayısı ne 3'e ne de 5'e tam bölünmektedir.");
        }
        
     
    }
}