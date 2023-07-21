
package tersucgen;

import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {
        
       Scanner scanner=new Scanner(System.in);
       
       int digitCount;
       
        System.out.println("Basamak sayisi: ");
        
        digitCount=scanner.nextInt();

            for(int i=digitCount ; i>=1; i--){
                for(int j=1;j<=2*i-1 ; j++){// yildiz sayisi
                    System.out.print("*");
                }  
                System.out.print(" ");
            }
                                    
        }
                    
    }
    

