import java.util.Scanner;

import java.util.Scanner;

public class Coklugorevaltı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir yıl giriniz: ");
        int yil = input.nextInt();
        
        if (yil % 400 == 0) {
            System.out.println(yil + "  artık yıldır.");
        } else if (yil % 100 == 0) {
            System.out.println(yil + " artık yıl değil.");
        } else if (yil % 4 == 0) {
            System.out.println(yil + "  artık yıldır.");
        } else {
            System.out.println(yil + " artık yıl değil.");
        }
        
      
    }
}