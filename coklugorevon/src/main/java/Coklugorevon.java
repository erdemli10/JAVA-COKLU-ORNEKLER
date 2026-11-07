import java.util.Scanner;

public class Coklugorevon{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi gir: ");
        int g = scan.nextInt();
        
        if (g == 1) System.out.println("Pazartesi");
        else if (g == 2) System.out.println("Sali");
        else if (g == 3) System.out.println("Carsamba");
        else if (g == 4) System.out.println("Persembe");
        else if (g == 5) System.out.println("Cuma");
        else if (g == 6) System.out.println("Cumartesi");
        else if (g == 7) System.out.println("Pazar");
        else System.out.println("Hatali sayi");
        

    }
}