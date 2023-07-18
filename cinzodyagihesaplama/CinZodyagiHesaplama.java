
package cinzodyagihesaplama;

import java.util.Scanner;

public class CinZodyagiHesaplama {

    
    public static void main(String[] args) {
        
        int dateOfBirthYear , reminder;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Dogum Yilinizi Giriniz: " );
        
        dateOfBirthYear= scanner.nextInt();
        
        reminder= dateOfBirthYear% 12 ;
        System.out.println(reminder);
        
        switch(reminder){
            case 0:
                System.out.println("Cin Zodyagi Burcunuz: Maymun");
                break;
            case 1: 
                System.out.println("Cin Zodyagi Burcunuz: Horoz");
                break;
                
        }
        
        
    }
    
}
