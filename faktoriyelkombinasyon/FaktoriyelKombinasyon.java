
package faktoriyelkombinasyon;

import java.util.Scanner;

public class FaktoriyelKombinasyon {

    public static void main(String[] args) {
      
        int number1,number2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayiyi girin: ");
        number1=scanner.nextInt();
        
        int total1=1;
        
        for(int i=1 ; i <=number1 ; i++){
            total1 *=i; // total1= total1 * i;
        }
        
        System.out.println("Bu sayinin Faktoriyeli: " +  total1);
        
                
        System.out.print("Ikinci sayiyi girin: ");
        number2=scanner.nextInt();
        
        int total2=1;
        
        for (int i=1; i<=number2; i++){
            total2=total2*i;
        }
        
        //System.out.println(total2);
        
        int total3=1; //Girilen sayilarin farkinin faktöriyel hesabi için oluşturuldu
        
        for(int i=1 ; i<= (number1-number2) ; i++){
            total3= total3* i;
        }
        
        int combinationValue= (total1 / (total2 * total3));
        System.out.println("C(" +number1 + "," +number2 + ")= "  + combinationValue);
        
    }
    
}
