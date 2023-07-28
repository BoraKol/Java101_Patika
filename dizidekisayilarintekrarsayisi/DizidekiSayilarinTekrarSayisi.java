
package dizidekisayilarintekrarsayisi;

import java.util.Arrays;

public class DizidekiSayilarinTekrarSayisi {
    
    public static void main(String[] args) {
       
        int [] arr = {10, 20, 20, 10, 10, 10, 5, 20};
        
        //Dizideki elemanlari kücükten buyuge siraladik...
        Arrays.sort(arr);
        
        int i,j,frequency;
        
        System.out.println("Tekrar Sayilari: ");
        
        for(i=0; i<arr.length;i++){
            frequency=1;
            for(j=i+1;j<arr.length;j++){
                if( arr[i]==arr[j] ){
                    frequency++;
                  
                }else {
                    break;
                }
            }
            i=j-1;
            if(frequency>1 ){
                 System.out.println(arr[i] + " sayisi " + frequency + " kere tekrar edildi.");
            }
        }
        
        
    }
    
}
