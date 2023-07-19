
package ushesaplama;

import java.util.Scanner;

public class UsHesaplama {
    
    public static void main(String[] args) {
                
        int n1,n2;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Ussu alinacak sayi: ");
        n1=scanner.nextInt();
        
        System.out.print("Us olacak sayi: ");
        n2=scanner.nextInt();
        
        int total=1;
        
        for(int i=1; i<=n2 ; i++){
            total*=n1; // total=total*n;
        }
        
        System.out.println(n1 + " uzeri " + n2 + ": " + total);
        
        
    }
    
}
