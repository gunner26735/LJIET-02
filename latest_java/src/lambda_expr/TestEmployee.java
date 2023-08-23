package lambda_expr;

import java.util.*;

public class TestEmployee {

    public static void builtInCollection(){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);

        for(Integer i:intList){
            System.out.println(i);
        }
        System.out.println("--------For Each using Lambda-------------");

        intList.forEach(i->System.out.println(i));

        Collections.sort(intList);
        System.out.println("Ascending order:"+intList);
        System.out.println("---------------------");

        Collections.reverse(intList);
        System.out.println("Descending Order"+intList);
        System.out.println("---------------------");

        Comparator<Integer> com = (n1,n2)->n2-n1;
        Collections.sort(intList,com);

        System.out.println("Descending Order using Lambda"+intList);
    }
    
    public static void employeeCollection(){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "adb", 45677));
        employeeList.add(new Employee(2, "fds", 5600));
        employeeList.add(new Employee(4, "azx", 16007));
        employeeList.add(new Employee(7, "yye", 75677));
        employeeList.add(new Employee(5, "uui", 1234));
        employeeList.add(new Employee(6, "bhu", 8944));
        int count=0;

        for (Employee e:employeeList) {
            count++;  
            System.out.println(e);
        }
        System.out.println("Count is:"+count);
        System.out.println("----------------------------");

        Comparator<Employee> sortEmp = (str1,str2)->(int)(str1.getSalary() - str2.getSalary());
        Collections.sort(employeeList,sortEmp);

        System.out.println("Ascending ORder:"+employeeList);

        Collections.reverse(employeeList);

        System.out.println("Descending ORder:"+employeeList);
    }
    public static void main(String[] args) {
        //TestEmployee.builtInCollection();
        TestEmployee.employeeCollection();
    }
}
