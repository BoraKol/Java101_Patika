
package burcbulma;

import java.util.Scanner;

public class BurcBulma {
    
    public static void main(String[] args) {
        
        int day,month;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Kacinci ayda dogdunuz? ");
        month=scanner.nextInt();
        
        System.out.println("Kacinci gunde dogdunuz? ");
        day=scanner.nextInt();
        
        if(month==1 && day>=22 && day<=31 || month==2 && day<=19){
            System.out.println("Kova burcu");
        }else if(month==2 && day>=20 && day<=28 || month==3 && day<=20){
            System.out.println("Balik burcu");
        }else if(month==3 && day>=21 && day<=31 || month==4 && day<=20 ){
            System.out.println("Koc burcu");
        }else if(month==4 && day>=21 && day<=30 || month==5 && day<=21){
            System.out.println("Boga burcu");
        }else if(month==5 && day>=22 && day<=31 || month==6 && day<=22){
            System.out.println("Ikizler burcu");
        }else if(month==6 && day>=23 && day<=30 || month==7 && day<=22){
            System.out.println("Yengec burcu");
        }else if(month==7 && day>=23 && day<=31 || month==8 && day<=22){
            System.out.println("Aslan burcu");
        }else if(month==8 && day>=23 && day<=31 || month==9 && day<=22){
            System.out.println("Basak burcu");
        }else if(month==9 && day>=23 && day<=30 || month==10 && day<=22){
            System.out.println("Terazi burcu");
        }else if(month==10 && day>=23 && day<=31 || month==11 && day<=21){
            System.out.println("Akrep burcu");
        }else if(month==11 && day>=22 && day<=30 || month==12 && day<=21){
            System.out.println("Yay burcu");
        }else if(month==12 && day>=22 && day<=31 || month==1 && day<=21){
            System.out.println("Oglak burcu");
        }else  {
            System.out.println("Hatali ay ve/veya gun bilgisi girdiniz...");
        }
                      
    }
    
}
