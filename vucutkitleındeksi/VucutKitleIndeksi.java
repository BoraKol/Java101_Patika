
package vucutkitleındeksi;

import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {
        
        double boy, kilo , vki;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Boyunuzu (metre) cinsinden girin: ");
        boy=scanner.nextDouble();
        
        System.out.println("Kilonuzu girin: ");
        kilo=scanner.nextDouble();
        
        vki= (kilo/(boy*boy));
        
        System.out.println("Vucut kitle indeksiniz: " + vki);
              
    }
    
}
