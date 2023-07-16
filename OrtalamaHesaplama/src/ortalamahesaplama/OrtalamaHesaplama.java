
package ortalamahesaplama;

import java.util.Scanner;



public class OrtalamaHesaplama {

    public static void main(String[] args) {
       
        // System.out.println("Hello world");
        
        int mat,fizik,kimya,turkce,tarih,muzik;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik notunu girin : ");
        mat = scanner.nextInt();
        
        System.out.println("Fizik notunu girin : ");
        fizik=scanner.nextInt();
        
        System.out.println("Kimya notunu girin : ");
        kimya=scanner.nextInt();
        
        System.out.println("Turkce notunu girin : ");
        turkce=scanner.nextInt();
        
        System.out.println("Tarih notunu girin: ");
        tarih= scanner.nextInt();
        
        System.out.println("Muzik notunu girin: ");
        muzik= scanner.nextInt();
        
        int toplam= (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama= toplam/6 ;
        
        System.out.println("Ortalamanız : " +ortalama);
             
        if(ortalama > 60 ){
            System.out.println("Tebrikler , Geçtiniz!");
        }
        
        else {
            System.out.println("Maalesef Kaldiniz...");
        }
        
           
        
    }
    
}
