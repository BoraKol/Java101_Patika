
package harmoniksayilaribulma;

import java.util.Scanner;

public class HarmonikSayilariBulma {

    public static void main(String[] args) {
       
        int number;
        
        double total=0;
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz: ");
        number=scanner.nextInt();
        
        for(double i=1 ; i<=number; i++){
            total+= (1/i);
        }
        
        System.out.println(total);
        
        
    }
    
}
