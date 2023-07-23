
package obsproject;

public class ObsProject {

    public static void main(String[] args) {
        
       Teacher t1= new Teacher("Mahmut Hoca" , "5555" , "TRH");
       Teacher t2= new Teacher("Graham Bell" , "0000" , "FZK");
       Teacher t3= new Teacher("Kulyutmaz" , "4444" , "BIO");    
        
       Course tarih= new Course("Tarih" ,"101" , "TRH");
       tarih.addTeacher(t1);
        
       Course fizik= new Course("Fizik" ,"102" , "FZK");
       fizik.addTeacher(t2);
       
       Course biyo= new Course("Biyoloji" ,"103" , "BIO");
       biyo.addTeacher(t3);
     
       Student s1 = new Student("Inek Saban", 4, "140144015", tarih, fizik, biyo);
       
       s1.addBulkExamNote(100,80,70,50,50,50);
       
       s1.isPass();
       
       Student s2=new Student("Guduk Necmi", 4, "2211133", tarih, fizik, biyo);
       s2.addBulkExamNote(50, 30, 70,60,60,60);
       
       s2.isPass();
              
    }
    
}
