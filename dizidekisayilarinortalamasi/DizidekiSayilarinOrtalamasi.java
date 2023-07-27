
package dizidekisayilarinortalamasi;

import java.util.Scanner;

public class DizidekiSayilarinOrtalamasi {

    public static void main(String[] args) {
      
        /*int numbers[]={1,2};
        
        int sum=0;
        
        System.out.println("Dizideki sayilarin ortalamasi");
        //ortalaması
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
*/
        int elemanSayisi;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin eleman sayisini girin: ");
        elemanSayisi=scanner.nextInt();
        
        double[] numbers= new double[elemanSayisi];
        System.out.print("Dizinin elemanlarini girin:\n");
        
        for(int i=0; i<numbers.length;i++){
            numbers[i]= scanner.nextDouble();
            
        }
        
        double sum=0.0;
        
        for(int i=0; i<numbers.length;i++){
            sum+= (1.0/numbers[i]);
        }
        
        double harmonicAverage = elemanSayisi / sum;
        
        System.out.println("Bu sayilarin harmonik ortalamasi: " + harmonicAverage);
        
}
    
}
