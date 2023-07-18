
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
            
            case 2:
                System.out.println("Cin Zodyagi Burcunuz: Kopek");
                break;
            
            case 3:
                System.out.println("Cin Zodyagi Burcunuz: Domuz");
                break;
            
            case 4:
                System.out.println("Cin Zodyagi Burcunuz: Fare");
                break;
               
            case 5:
                System.out.println("Cin Zodyagi Burcunuz: Okuz");
                break;
                
            case 6:
                System.out.println("Cin Zodyagi Burcunuz: Kaplan");
                break;
            
            case 7:
                System.out.println("Cin Zodyagi Burcunuz: Tavsan");
                break;
                
            case 8:
                System.out.println("Cin Zodyagi Burcunuz: Ejderha");
                break;
                
            case 9:
                System.out.println("Cin Zodyagi Burcunuz: Yilan");
                break;
                
            case 10:
                System.out.println("Cin Zodyagi Burcunuz: At");
                break;
                
            case 11: 
                System.out.println("Cin Zodyagi Burcunuz: Koyun");
                break;
              
        }
        
    }
    
}

