import java.util.Scanner;

public class Coklugorevbes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Notunuzu giriniz ");
       
        int notDegeri = input.nextInt();
        
        if (notDegeri < 0 || notDegeri > 100) {
            System.out.println("boyle bir not yok");
        } else if (notDegeri >= 90) {
            System.out.println(" Notunuz: AA");
        } else if (notDegeri >= 80) {
            System.out.println(" Notunuz: BA");
        } else if (notDegeri >= 70) {
            System.out.println(" Notunuz: BB");
        } else if (notDegeri >= 60) {
            System.out.println(" Notunuz: CB");
        } else if (notDegeri >= 50) {
            System.out.println(" Notunuz: CC");
        } else {
            System.out.println("Notunuz: FF (Kaldınız)");
        }
        
       
    }
}