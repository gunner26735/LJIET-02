package lambda_expr;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "A1", "CE", 76.9));
        students.add(new Student(2, "B1", "CE", 89.9));
        students.add(new Student(3, "C1", "IT", 66.9));
        students.add(new Student(4, "D1", "ME", 56.9));

        for(Student s:students){
            System.out.println(s);
        }

        System.out.println("----------------------------");

        Predicate<Student> pobj = (Student stud)->stud.getStream().equals("CE");
        List<Student> pobjList = new ArrayList<Student>();

        for(Student stud:students){
            if(pobj.test(stud)){
                pobjList.add(stud);
            }
        }

        for(Student s:pobjList){
            System.out.println(s);
        }
        System.out.println("-----------------------");
        
        
        Consumer<Student> consumerPercentage = (Student stud)->{
            System.out.println("Student Name:"+stud.getName()+" : "+stud.getPercentage());
        };
        
        for (Student student : students) {
            consumerPercentage.accept(student);
        }


        System.out.println("-----------------------------------");

        Function<Student,String> functionStudent = (Student stud)->stud.getName();
        List<String> listNames = new ArrayList<String>();

        for(Student s:students){
            listNames.add(functionStudent.apply(s));
        }

        for(String s:listNames){
            System.out.println(s);
        }
    }
}
