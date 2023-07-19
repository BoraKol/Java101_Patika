
package dongulerpratik2;

import java.util.Scanner;

public class DongulerPratik2 {

    public static void main(String[] args) {
       
        int number,total=0;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
             System.out.println("Bir sayi girin: ");
             number=scanner.nextInt();
             if(number%2==0 || number%4==0){
                 total += number; // total=total+number;
             }
             
        } while(number%2==0);
        
        System.out.println("Toplam: " + total);
        
               
    }
    
}
