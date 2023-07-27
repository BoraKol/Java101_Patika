
package dizidemaxminbulma;

import java.util.Arrays;
import java.util.Scanner;

public class DizideMaxMinBulma {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dizideki eleman sayisini girin: ");
        int elemanSayisi;
        elemanSayisi=scanner.nextInt();
        
        int [] numbers= new int[elemanSayisi];
        System.out.println("Dizinin elemanlarini girin: ");
        
        for(int i =0; i<numbers.length;i++){
            numbers[i]=scanner.nextInt();         
        }
        
        Arrays.sort(numbers);
        System.out.println("Dizi: " + Arrays.toString(numbers));
                
        int number;
        System.out.print("Bir sayi girin: ");
        number=scanner.nextInt();
                
        int min=number;
        int max=number;
               
        for(int i= numbers.length-1; i>=0;i--){
            if(numbers[i]<min){
                min=numbers[i];
                break;
            }
        }
        
        for(int i : numbers){
            if(i>max){
                max=i;
                break;
            }
        }
        
        System.out.println("Girilen sayidan kucuk en buyuk sayi: " + min);
        System.out.println("Girilen sayidan buyuk en kucuk sayi: " + max);

        
        
        
    }
    
}
