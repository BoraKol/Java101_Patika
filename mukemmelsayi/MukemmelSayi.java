
package mukemmelsayi;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);        
        int number;
        
        System.out.print("Bir sayi giriniz: ");
        number=scanner.nextInt();
        
        int digitTotal=0;
        
        for(int i=1; i<number;i++){
            if(number%i==0){
                digitTotal+=i;
                
            }            
        }
        
        if(digitTotal==number){
              System.out.println(number + " mukemmel bir sayidir.");
        }else {
            System.out.println(number + " mukemmel bir sayi degildir.");
        }
        
         
         
    }
    
}
