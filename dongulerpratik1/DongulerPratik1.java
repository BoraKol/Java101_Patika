
package dongulerpratik1;

import java.util.Scanner;

public class DongulerPratik1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int girilenSayi,toplam=0,sayac=0;
        double ortalama;
        
        System.out.println("Bir sayi giriniz: ");
        girilenSayi=scanner.nextInt();
        
                
        for(int i=0 ; i<=girilenSayi ; i ++){
            
            if(i%3==0 && i%4==0){
                toplam=toplam + i;
                sayac++;                            
            }
                      
        }
        
        ortalama=(double) toplam/sayac;
        
        System.out.println("Ortalama: " + ortalama);
        
        
        
        
        
        
    }
    
}
