
package dizidekielemanlarisiralama;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        int dizininBoyutu;
        
        System.out.print("Dizinin boyutu: ");
        dizininBoyutu=scanner.nextInt();
        
        int [] arr = new int[dizininBoyutu];
        
        System.out.print("Dizinin elemanlarini giriniz: ");
        
        for(int i=0; i<arr.length;i++){
            
            arr[i]=scanner.nextInt();
            System.out.println("Dizinin " + (i+1) + ". elemani: " + arr[i]);
            
        }
        
       System.out.print("Dizinin siralanmamis hali: ");
       for (int num : arr){
            
           System.out.print(num + " ");
       }
      
       Arrays.sort(arr);
       System.out.println();
       System.out.print("Siralama: ");
       
       for (int num : arr){
           System.out.print(num + " ");
       }
        
        
        
    }
    
}
