
package artikyil;

import java.util.Scanner;

public class ArtikYil {
    
    public static void main(String[] args) {
       
      int year ;
      
      Scanner scanner =new Scanner(System.in);
      
      System.out.println("Yil Giriniz: ");
      
      year=scanner.nextInt();
      
      if((year%4==0 && year%100!=0) || (year %400==0) ){  //burasi duzenlenecek       
          
          System.out.println(year + " artik bir yildir.");
                 
      }else {
          System.out.println(year + " artik bir yil degildir.");
      }
               
    }

}
