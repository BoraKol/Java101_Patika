
package yildizlarlaelmasolusturma;

import java.util.Scanner;

public class YildizlarlaElmasOlusturma {

    public static void main(String[] args) {
        
        int height;
          
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasin yuksekligini giriniz: ");
        height = scanner.nextInt();

        if (height % 2 == 0) {
            System.out.println("Yukseklik tek sayi olmali!");
            return;
        }

        int spaces = height / 2;
        int stars = 1;

        // Elmasın üst yarısını çizdirme
        for (int i = 0; i < height / 2 + 1; i++) {
            // Boşlukları çizdirme
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            
            // Yıldızları çizdirme
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
            spaces--;
            stars += 2;
        }

        // Elmasın alt yarısını çizdirme
        spaces = 1;
        stars = height - 2;

        for (int i = 0; i < height / 2; i++) {
            // Boşlukları çizdirme
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            
            // Yıldızları çizdirme
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
            spaces++;
            stars -= 2;
        }
  
    }

}