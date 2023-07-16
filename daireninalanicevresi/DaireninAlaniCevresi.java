
package daireninalanicevresi;

import java.util.Scanner;

public class DaireninAlaniCevresi {

    public static void main(String[] args) {
       
       double yaricap,cevre,alan,merkezAci, daireDilimininAlani;
       final double PI= 3.14;
       
       Scanner scanner=new Scanner(System.in);
       
       System.out.println("Yaricapi giriniz: ");
       yaricap=scanner.nextDouble();
       
       cevre= (2*PI * yaricap);
       
       alan= (PI * Math.pow(yaricap,2));
       
       System.out.println("Daire diliminin merkez acisini giriniz: ");
       merkezAci=scanner.nextDouble();
       
       daireDilimininAlani= (PI *(Math.pow(yaricap,2) * merkezAci))/360 ;
       
       System.out.println("Dairenin cevresi: " + cevre);
        
       System.out.println("Dairenin alani: " + alan);
        
       System.out.println("Daire diliminin alani: " + daireDilimininAlani); 
    }
    
}
