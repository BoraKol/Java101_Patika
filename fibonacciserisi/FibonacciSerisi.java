
package fibonacciserisi;

import java.util.Scanner;


public class FibonacciSerisi {

   
    public static void main(String[] args) {
        
        int elemanSayisi;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Fibonacci serisinin eleman sayisini girin: ");
        elemanSayisi=scanner.nextInt();
        
        int ilkEleman=0;
        int ikinciEleman=1;
        
        for(int i=1;i<=elemanSayisi;i++){
            System.out.println(ilkEleman + " ");
            int sonrakiEleman=ilkEleman+ikinciEleman;
            ilkEleman=ikinciEleman;
            ikinciEleman=sonrakiEleman;
        }
    }
    
}
