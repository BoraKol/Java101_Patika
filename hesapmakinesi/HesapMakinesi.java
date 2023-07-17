
package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        
        int number1,number2,selected;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ilk sayiyi girin: ");
        number1= scanner.nextInt();
        
        System.out.println("İkinci sayiyi girin: ");
        number2=scanner.nextInt();
        
        System.out.println("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme");
        System.out.println("Seciminiz : ");
        
        selected=scanner.nextInt();
                       
        switch(selected){
            
            case 1: 
                System.out.println("Toplam sonucu: " + (number1+number2));
            break;
            
            case 2: 
                System.out.println("Cikarma sonucu: " + (number1-number2));
            break;
            
            case 3: 
                System.out.println("Carpim sonucu: " + (number1 * number2));
            break;
            
            case 4: 
                if(number2!= 0){
                    System.out.println("Bolme sonucu: " + (number1/number2));
                } else {
                    System.out.println("Bir sayi 0'a bolunemez!");
                }
            break;    
                
            default:
                System.out.println("Yanlis secim yaptiniz. Lutfen tekrar deneyiniz...");
            break;    
        }
             
    }
    
}
