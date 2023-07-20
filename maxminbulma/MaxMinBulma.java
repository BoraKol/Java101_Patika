
package maxminbulma;

import java.util.Scanner;

public class MaxMinBulma {
   
    public static void main(String[] args) {
       
        Scanner scanner= new Scanner(System.in);
        
        int amountOfNumbers,number ;
        int smallest=Integer.MAX_VALUE;
        int highest=Integer.MIN_VALUE;
        
        System.out.print("Kac tane sayi gireceksiniz: ");
        amountOfNumbers=scanner.nextInt();
        
        for(int i=1; i<=amountOfNumbers;i++){
            System.out.print(i + ". Sayiyi giriniz: ");
            number=scanner.nextInt();
            
           if(number<smallest){
               smallest=number;
           } else if(number>highest){
               highest=number;
           }
                    
        }        
         System.out.println("En buyuk sayi: " + highest);
         System.out.println("En kucuk sayi: " + smallest);                               
    }
    
}
