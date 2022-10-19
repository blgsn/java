
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
    	// Employee(int id, String name, double salary, int hours, int hireYear)
        Employee employee =  new Employee(1, "Ali", 2000.0, 45, 2000);
        Employee employee1 =  new Employee(2, "Veli", 3000.0, 40, 2010);
        Employee employee2 =  new Employee(3, "Mehmet", 2800.0, 35, 2017);
        Employee employee3 =  new Employee(4, "Furkan", 2500.0, 30, 2020);
        Employee employee4 =  new Employee(5, "Ayşe", 2900.0, 48, 2018);
        Employee employee5 =  new Employee(6, "Can", 2100.0, 46, 2005);
        Employee employee6 =  new Employee(7, "Canan", 2200.0, 47, 2004);
        
        employee.show_the_Employee();
        System.out.println(employee.toString());
        employee.bonus();
        employee.tax();
        employee.raise_salary();
        employee1.show_the_Employee();
        System.out.println(employee1.toString());
        employee1.bonus();
        employee1.tax();
        employee1.raise_salary();
        employee2.show_the_Employee();
        System.out.println(employee2.toString());
        employee2.bonus();
        employee2.tax();
        employee2.raise_salary();
        employee3.show_the_Employee();
        System.out.println(employee3.toString());
        employee3.bonus();
        employee3.tax();
        employee3.raise_salary();
        employee4.show_the_Employee();
        System.out.println(employee4.toString());
        employee4.bonus();
        employee4.tax();
        employee4.raise_salary();
        employee5.show_the_Employee();
        System.out.println(employee5.toString());
        employee5.bonus();
        employee5.tax();
        employee5.raise_salary();
        employee6.show_the_Employee();
        System.out.println(employee6.toString());
        employee6.bonus();
        employee6.tax();
        employee6.raise_salary();
       
    }
    

}