
package hipotenusbulma;

import java.util.Scanner;

public class HipotenusBulma {

    public static void main(String[] args) {
        
        int kenar1,kenar2;
        double hipotenus;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("1.kenar uzunlugunu girin: ");
        kenar1=scanner.nextInt();
        
        System.out.println("2.kenar uzunlugunu girin: ");
        kenar2=scanner.nextInt();
        
        System.out.println("Ucgenin 1.kenar uzunlugu: " + kenar1);
        System.out.println("Ucgenin 2.kenar uzunlugu: "  + kenar2);
        
        hipotenus=Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        
        System.out.println("Hipotenus: " + hipotenus);
        
        double alan;
        alan= (double)((kenar1*kenar2)/2);
        System.out.println("Ucgenin alani: " + alan);
        
        
        
        
        
        
        
        
        
    }
    
}
