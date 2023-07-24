package maashesaplayici;

public class MaasHesaplayici {
    
    public static void main(String[] args) {
        
        Employee emp1= new Employee("Bora" , 10000 , 42 , 2010);
        emp1.tax();
        emp1.raiseSalary();
        emp1.bonus(45);
        emp1.printInfo();
        
        System.out.println("----------------");
        
        Employee emp2=new Employee("Ali" , 8500 , 35 , 2015 );
        emp2.tax();
        emp2.raiseSalary();
        emp2.bonus(43);
        emp2.printInfo();
              
    }
    
}
