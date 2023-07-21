
package asalsayibulma;

public class AsalSayiBulma {
    
    public static void main(String[] args) {
        
        System.out.println("1-100 arasindaki asal sayilar: ");

        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean isPrime = true;
            
            // 2'den başlayarak sayının kareköküne kadar olan değerlere bölenlerini kontrol ederiz.
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    isPrime = false;
                    break; // Eğer bir bölen bulunursa, sayı asal değildir ve iç döngüden çıkılır.
                }
            }
            
            // isPrime değişkeni hala true ise, sayı asaldır ve ekrana yazdırılır.
            if (isPrime) {
                System.out.print(sayi + " ");
            }
        }
    }    
}
