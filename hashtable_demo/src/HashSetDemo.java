import java.util.*;

public class HashSetDemo{
    public static void main(String[] args) {
        hashSetPrimitive();
        hashSetNonPrimitive();
    }

    static void hashSetPrimitive(){
        //Dont allow Duplicate values in primitive data type by default
        HashSet<String> nameSet = new HashSet<String>();
        nameSet.add("Luffy");
        nameSet.add("Dora");
        nameSet.add("Zoro");
        nameSet.add("Koda");
        nameSet.add("Luffy");

        System.out.println(nameSet);
        Iterator<String> itr = nameSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void hashSetNonPrimitive(){
        HashSet<EmpType> employeeSet = new HashSet<EmpType>();
        employeeSet.add(new EmpType(1, "Luffy"));
        employeeSet.add(new EmpType(2, "Dora"));
        employeeSet.add(new EmpType(3, "Zoro"));
        employeeSet.add(new EmpType(4, "Koda"));

        Iterator<EmpType> itr = employeeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}