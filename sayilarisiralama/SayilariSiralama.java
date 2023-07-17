
package sayilarisiralama;

import java.util.Scanner;

public class SayilariSiralama {

    public static void main(String[] args) {
        
        int a,b,c;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Birinci sayiyi girin: ");
        a= scanner.nextInt();
                    
        System.out.println("Ikinci sayiyi girin: ");
        b=scanner.nextInt();
        
        System.out.println("Ucuncu sayiyi girin: ");
        c=scanner.nextInt();
        
        if(a<b && b<c){
            System.out.println("a<b<c");                   
        }else if(a<b && b>c){
            System.out.println("a<c<b");
        }else if(a>b && a<c){
            System.out.println("b<a<c");
        }else if(a<b && a>c){
            System.out.println("c<a<b");
        }else if(a>b && b>c){
            System.out.println("c<b<a");
        }else if(b<c && c<a){
            System.out.println("b<c<a");
        }
              
    }
    
}
