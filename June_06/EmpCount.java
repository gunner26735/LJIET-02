package june6_ass;

import java.util.Scanner;

class Employee{
    private static int count = 0;
    private String emp_id,emp_name;
    
    Employee(){
        count++;
    }
    
    @Override
    public String toString() {
        return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
    }
    public static int getEmployeeCount(){
        return count;
    }

    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee id:");
        emp_id = sc.nextLine();
        System.out.println("Enter Employee Name: ");
        emp_name = sc.next();
    }
}

public class EmpCount {
    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        int count =0;
        char cont = 'y';
        Scanner sc = new Scanner(System.in);
        do{
            e[count] = new Employee();
            e[count].setData();
            System.out.println("Do you want add new Employee(y/N): ");
            cont = sc.nextLine().charAt(0);
            count++;
        }while(count < 5 && (cont == 'y' || cont == 'Y'));
        System.out.println("Total count of Employee's are: "+Employee.getEmployeeCount());
    }
}
