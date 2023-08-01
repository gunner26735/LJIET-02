package collections;

import java.util.*;

class Emp{
    int id;
    String name;
    int salary;
    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

//TO Sort Collection By Id
class IdComaparer implements Comparator<Emp>{
    public int compare(Emp EmpAlias,Emp EmpAlias2){
        return EmpAlias.getId() - EmpAlias2.getId();
    }
}

//TO Sort Collection By Salary
class SalaryComaparer implements Comparator<Emp>{
    public int compare(Emp EmpAlias,Emp EmpAlias2){
        return EmpAlias.getSalary()-EmpAlias2.getSalary();
    }
}

//TO Sort Collection By Name
class NameComaparer implements Comparator<Emp>{
    public int compare(Emp EmpAlias,Emp EmpAlias2){
        return EmpAlias.getName().compareTo(EmpAlias2.getName());
    }
}

public class AssignmentEmp {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<Emp>();
        emps.add(new Emp(34, "Kuro", 1050));
        emps.add(new Emp(14, "Zen", 550));
        emps.add(new Emp(3, "Luffy", 9000));
        emps.add(new Emp(7, "Law", 89700));

        Scanner sc = new Scanner(System.in);
        int choice = 0; 
        char ch = 'y';
        do{
            System.out.print("Enter any Choice to Sort Employee Data By:\n1.Id\n2.Name\n3.Salary\n0.Exit\nYour Choice = ");
            choice =  sc.nextInt();
            switch(choice){
                case 0 :{ System.out.println("Thank YOU!!!");choice = 0;}break;
                case 1 : {Collections.sort(emps,new IdComaparer());}break;
                case 2 : {Collections.sort(emps,new NameComaparer());}break;
                case 3 : {Collections.sort(emps,new SalaryComaparer());}break;
                default : {System.out.println("Enter Correct Choice");}break;
            }
            if(choice >=1 && choice<=3){
                for(Object eachEmp : emps){
                    System.out.println(eachEmp.toString());
                }
                System.out.println("\n\nDo you want to Continue:(y/n)");
                ch = sc.next().charAt(0);
            }
        }while((choice != 0) && (ch == 'y'));
    }
}
