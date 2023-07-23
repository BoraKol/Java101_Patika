
package obsproject;

public class Course {
    
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    double courseAverage;
    
    
    Course(String name,String code , String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        courseAverage=0.0;
    }
    
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
             this.teacher=teacher;
        }else {
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor...");
        }
      // printTeacherInfo();
    }
    
    void printTeacherInfo(){
        this.teacher.print();
    }
       
}
