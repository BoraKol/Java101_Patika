
package manavkasaprogrami;

import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
      
        double armut , elma , domates , muz , patlican , tutar;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Armut kac kilo? ");
        armut=scanner.nextDouble();
        
        System.out.println("Elma kac kilo? ");
        elma=scanner.nextDouble();
        
        System.out.println("Domates kac kilo? ");
        domates=scanner.nextDouble();
        
        System.out.println("Muz kac kilo? ");
        muz=scanner.nextDouble();
        
        System.out.println("Patlican kac kilo? ");
        patlican=scanner.nextDouble();
        
        
        //ARMUT=2.14 TL , ELMA=3.67 TL , DOMATES=1.11 TL , MUZ=0.95 TL , PATLICAN=5 TL
        tutar=((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0));
        
        System.out.println("Toplam Tutar: " + tutar + " TL");
        
    }
    
}
