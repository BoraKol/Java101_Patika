
package kdvtutarihesapla;

import java.util.Scanner;

public class KDVTutariHesapla {

    public static void main(String[] args) {
        
        int tutar ;
        
        double kdv=0, kdvliFiyat=0;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Tutari girin: ");
        
        tutar= scanner.nextInt();
        
        System.out.println("Tutar : " + tutar);
        
        if(tutar> 0 && tutar <=1000){
            kdv= ((tutar*18)/100 );
            kdvliFiyat= tutar + kdv;
        }else if(tutar >1000){
            kdv=(tutar * 8 /100);
            kdvliFiyat=tutar+kdv;
        }else {
            System.out.println("Gecersiz tutar girdiniz...");
        }
                
        System.out.println("KDV Tutari: " + kdv );
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        
        
        
        
        
        
    }
    
}
