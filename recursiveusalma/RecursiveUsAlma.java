
package recursiveusalma;

import java.util.Scanner;

public class RecursiveUsAlma {

    static int power(int base , int exponent){
        if(exponent==0){
            return 1;
        }else if(base==1){
            return 1;
        }else {
            return base *power(base,exponent-1);
        }
    }
    
        
    public static void main(String[] args) {
        
        int base,exponent;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Taban degerini giriniz: " );
        base=scanner.nextInt();
        
        System.out.print("Us degerini giriniz: ");
        exponent=scanner.nextInt();
        
        System.out.print("Sonuc: " + power(base, exponent));
        
        
        
        
    }
    
}
