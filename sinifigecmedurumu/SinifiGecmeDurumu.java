
package sinifigecmedurumu;

import java.util.Scanner;

public class SinifiGecmeDurumu {

    
    public static void main(String[] args) {
        
        int mat,turkce,fizik,kimya,muzik;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Matematik notunuz: ");
        mat=scanner.nextInt();
        
        System.out.println("Turkce notunuz: ");
        turkce=scanner.nextInt();
        
        System.out.println("Fizik notunuz: ");
        fizik=scanner.nextInt();
        
        System.out.println("Kimya notunuz: ");
        kimya=scanner.nextInt();
        
        System.out.println("Muzik notunuz: ");
        muzik=scanner.nextInt();
        
        
        if( mat>=0 && mat<=100 && turkce>=0 && turkce<=100 && fizik>=0 && fizik<=100 &&
                kimya>=0 && kimya<=100 && muzik>=0 && muzik<=100 ){
        
            double ortalama=(mat+turkce+fizik+kimya+muzik)/5;
            if(ortalama<=55){
            System.out.println("Maalesef sinifta kaldiniz...");
            }else {
            System.out.println("Tebrikler, sinifi gectiniz!");
            }
            
            System.out.println("Ortalamaniz: " + ortalama);
        }else {
            System.out.println("Ortalamaniz hesaplanamadi , gecersiz not girisi...");
        }

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
