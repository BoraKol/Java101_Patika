
package basamaktoplami;

import java.util.Scanner;

public class BasamakToplami {

    public static void main(String[] args) {
        
        int number, tempNumber;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz: ");
        
        number=scanner.nextInt();
        
        int total=0;
        
        tempNumber=number;
        
        while(tempNumber!=0){
            int basamak= tempNumber%10;
            total+=basamak;
            tempNumber/=10;
        }
        
        System.out.println("Sayinin basamaklari toplami: "+ total);
        
    }
    
}
