package maashesaplayici;

public class Employee {
    
    String name;
    double salary;
    int workOfHours;
    int hireYear;
    
    public Employee(String name,double salary, int workOfHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workOfHours=workOfHours;
        this.hireYear=hireYear;
    }
    
    public Employee(){
        
    }
    
    public void tax(){
        if(this.salary<1000){
            System.out.println("Sizden vergi alinmayacaktir. Maasiniz: " + this.salary);
        }else {
            System.out.println("Sizden maasinizin %3'u kadar vergi kesintisi olacaktir. Maasiniz: "
            + (this.salary-this.salary *3/100));
        }
       
    }
    
    public void bonus(int totalHours){
        if(this.workOfHours>40&& totalHours> workOfHours){
            System.out.println("Calisanin bonuslarla beraber alacagi toplam ucret: " +
                    (this.salary += ((totalHours - workOfHours) * 30)) );
        }else {
            System.out.println("Calisanin maasi: " + this.salary);
        }
     
    }
    
    public void raiseSalary(){// Suanki yil 2021 olarak alindi.. Sadece yil oldugu hireYear degiskeni integer olarak alindi
        if(this.hireYear>2011){
            System.out.println("Calisanin %5 zamli yeni maasi: " + (this.salary+= this.salary*5/100) );
        }
        else if(this.hireYear>2001){
            System.out.println("Calisanin %10 zamli maasi: "  + (this.salary+=this.salary*10/100));
        }
        else if(this.hireYear<=2001){
            System.out.println("Calisanin %15 zamli maasi: " + (this.salary+= this.salary*15/100));
        }
        
    }
    
    public void printInfo(){
        System.out.println("------Calisanin Bilgileri------");
        System.out.println("Calisanin adi: " + this.name);
        System.out.println("Calisanin haftalik calistigi saat: " + this.workOfHours);
        System.out.println("Calisanin maasi: " + this.salary);
        System.out.println("Calisanin ise alindigi yil: " + this.hireYear);
    }
    
    
    
    
    
    
}
