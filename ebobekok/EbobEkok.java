
package ebobekok;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
        
        int n1,n2;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Birinci sayiyi girin: ");
        n1=scanner.nextInt();
        
        System.out.println("Ikinci sayiyi girin: ");
        n2=scanner.nextInt();
        
        int i=1,ebob=1;
        
        //ebob
        while(i<=n1){
            if(n1%i==0 && n2%i==0){   
                ebob=i;                  
            }                
            i++;         
        }
        
        System.out.println("Bu iki sayinin ebob'u: " + ebob); 
        
        //ekok
        while(i<=(n1*n2)){
            if(i%n1==0 && i%n2==0){
                System.out.println("Bu iki sayinin ekok'u: "+ i);
                break;
            }
            
            i++;
        }
        
        
        
        
        
        
    }
    
}
