
package kullanicigirisi;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
       
        String userName,password,newPassword;
        int secim=0;
        
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Kullanici adiniz: ");
        userName=scanner.nextLine();
        
        System.out.println("Sifreniz: ");
        password=scanner.nextLine();
        
        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giris yaptiniz! ");
        }else {
            System.out.println("Sifrenizi sifirlamak ister misiniz? ");
            System.out.println("1-Evet \n2-Hayir ");
            secim=scanner.nextInt();
            System.out.println("Seciminiz: " + secim);
            
            if(secim==1){
                System.out.println("Yeni sifrenizi girin: ");
                newPassword=scanner.next();
                System.out.println("Yeni sifre : " + newPassword);
                if(!password.equals(newPassword)){
                    System.out.println("Sifreniz olusturuldu. Yeni sifreniz : " + newPassword);
                }
                else {
                    System.out.println("Sifre olusturulamadi , lutfen yeni sifre giriniz...");
                }
                
            }else {
                System.out.println("Sifreniz hatali oldugu icin yeni sifre olusturmayi secmezseniz giris yapamazsiniz...");
            }                                                                                                       
        }
                   
    }
    
}
