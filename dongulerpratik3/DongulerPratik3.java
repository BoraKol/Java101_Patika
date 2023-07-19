
package dongulerpratik3;

import java.util.Scanner;


public class DongulerPratik3 {

    public static void main(String[] args) {
       
        int number;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Sinir sayisini giriniz: ");
        number=scanner.nextInt();
        
        System.out.println("4'un kuvvetleri: ");
        for(int i=1; i<=number; i*=4){
            System.out.println(i);
            
        }
        
        System.out.println("5'in kuvvetleri: ");
        for(int j=1; j<=number; j*=5){
            System.out.println(j);
        }
        
    }
    
}
