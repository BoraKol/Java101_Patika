
package recursiveasalsayibulma;

import java.util.Scanner;

public class RecursiveAsalSayiBulma {
    
    static boolean isPrime(int number ){
        
        int counter=0;
        
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0) {
                counter++;
            }
        }
        if(counter == 0) {
            return true;
        }
        else {
            return false;
        }
     
    }
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sayi girin: ");
        num=scanner.nextInt();
        
        if(isPrime(num)){
            System.out.println(num + " Asaldir!");
        }else {
            System.out.println(num+ " Asal degildir...");
        }
       
       
        
        
        
    }
    
}
