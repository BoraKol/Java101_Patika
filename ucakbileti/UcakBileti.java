
package ucakbileti;

import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {
        
        int mesafe , yas , yolculukTipiSecimi;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mesafeyi km turunden giriniz: ");
        mesafe=scanner.nextInt();
        
        System.out.println("Yasinizi giriniz: ");
        yas=scanner.nextInt();
        
        System.out.println("Yolculuk tipini seciniz: ");
        System.out.println("1-Tek Yon\n2-Gidis Donus");
        
        yolculukTipiSecimi=scanner.nextInt();
        
        System.out.println("Seciminiz : " + yolculukTipiSecimi );
          
        
        double normalTutar,yasIndirimi,indirimliTutar,gidisDonusBiletIndirimi,toplamTutar;
        
        if(mesafe>0 && yas>=0 && yas<=100 && yolculukTipiSecimi==1 || yolculukTipiSecimi==2){
            
             if( yas<12 && yolculukTipiSecimi==1 ){
                normalTutar= mesafe * 0.1;
                yasIndirimi=normalTutar * 0.5;
                indirimliTutar=normalTutar - yasIndirimi;
                toplamTutar=indirimliTutar;
                System.out.println("Toplam Tutar :  " + toplamTutar  + " TL");  
            
            }else if( yas<12 && yolculukTipiSecimi==2){
                normalTutar=mesafe * 0.1;
                yasIndirimi=normalTutar * 0.5;
                indirimliTutar=normalTutar - yasIndirimi;
                gidisDonusBiletIndirimi=indirimliTutar * 0.2;
                toplamTutar=(indirimliTutar - gidisDonusBiletIndirimi) * 2;
                System.out.println("Toplam Tutar : " + toplamTutar + " TL");
                
            }else if(yas>=12 && yas<=24 && yolculukTipiSecimi==1 ){
                normalTutar= mesafe * 0.1;
                yasIndirimi=normalTutar * 0.1;
                indirimliTutar=normalTutar - yasIndirimi;
                toplamTutar=indirimliTutar;
                System.out.println("Toplam Tutar : " + toplamTutar + "TL");
                
            }else if(yas>=12 && yas<=24 && yolculukTipiSecimi==2){
                normalTutar=mesafe * 0.1;
                yasIndirimi=normalTutar * 0.1;
                indirimliTutar=normalTutar - yasIndirimi;
                gidisDonusBiletIndirimi=indirimliTutar * 0.2;
                toplamTutar=(indirimliTutar - gidisDonusBiletIndirimi) * 2 ;
                System.out.println("Toplam Tutar : " + toplamTutar + " TL");
                                      
            }else if( yas>24 && yas<=65 && yolculukTipiSecimi==1){
                normalTutar=mesafe * 0.1;
                toplamTutar=normalTutar;
                System.out.println("Toplam Tutar : " + toplamTutar + "TL");
                        
            }else if( yas>24 && yas<=65 && yolculukTipiSecimi==2){
                normalTutar=mesafe * 0.1;
                toplamTutar=normalTutar * 2;
                System.out.println("Toplam Tutar :" + toplamTutar + "TL");
                
            }else if(yas>65 && yolculukTipiSecimi==1 ){
                normalTutar=mesafe * 0.1;
                yasIndirimi=normalTutar * 0.3;
                indirimliTutar=normalTutar - yasIndirimi;
                toplamTutar=indirimliTutar;
                System.out.println("Toplam Tutar : " + toplamTutar + "TL");
                
            }else if(yas>65 && yolculukTipiSecimi==2 ){
                normalTutar=mesafe * 0.1;
                yasIndirimi=normalTutar * 0.3;
                indirimliTutar=normalTutar - yasIndirimi;
                gidisDonusBiletIndirimi= indirimliTutar * 0.2;
                toplamTutar=(indirimliTutar - gidisDonusBiletIndirimi) * 2;
                 System.out.println("Toplam Tutar: " + toplamTutar + "TL");                       
            }
                                     
        }else {
            System.out.println("Hatali veri girdiniz...");
        }
        
    }   
    
}
