
package desenegoremetot;

import java.util.Scanner;

public class DeseneGoreMetot {
    
    static void recursivePattern(int a , int b , boolean isNegative ){
        
         if (a<= 0){
              isNegative= true;
         }
         
        System.out.print(a+ " ");
        
        if (isNegative == false ){
            recursivePattern(a-5,b+1,isNegative);
        }else {
            if (b==0){
                return;
                
            }else{
                recursivePattern(a+5,b-1,isNegative); 
            }
        }    
    }
               
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        int num;
        
        System.out.print("Bir sayi girin: ");
        num=scanner.nextInt();
        
        recursivePattern(num, 0, false);
    }
    
}
