
package taksimetre;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        int km;
        double pricePerKm, totalPrice=10.0 ;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Gidilecek mesafeyi km cinsinden söyleyiniz: ");
        
        km=scanner.nextInt();
        
        pricePerKm=(km * 2.2);
        
        totalPrice +=pricePerKm;
        
        if(totalPrice<20) {
            totalPrice=20;
            System.out.println("Odemeniz gereken tutar "  + totalPrice + " Tl'dir" ) ;
        }
        
        else {
            System.out.println("Odemeniz gereken tutar " + totalPrice + " Tl'dir");
        }
        
        
    }
    
}
