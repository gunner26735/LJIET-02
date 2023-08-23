package lambda_expr;

import java.util.ArrayList;
import java.util.List;

// @FunctionalInterface
interface InterfaceA{
    public void print();

    //A functional Interface can have only one method of abstract type.
    //But can have multiple default and static methods

    // default void show(){
    // }
    // static void display(){
    // }
}


public class TestClass {
    
    public static void withoutLambda(){
        int a=22;
        InterfaceA obj = new InterfaceA() {
            public void print(){
                System.out.println("Print from Interface A = " + a);
            }
        };
        obj.print();
    }

    public static void ListLambda(){
        List<String> l1 = new ArrayList<String>();
        l1.add("ABC");
        l1.add("XYZ");
        l1.add("PQR");

        for(String s:l1){
            System.out.println(s);
        }
        System.out.println("------------------------------");

        l1.forEach(s->{
            System.out.println(s);
        });
    }

    public static void withLambda(){
        int a=455;
        InterfaceA obj2 = ()->{
            System.out.println("Printing Number = "+a);
        };
        obj2.print();
    }

    public static void main(String[] args) {
        TestClass.withoutLambda();
        System.out.println("------------------------------");

        TestClass.withLambda();
        System.out.println("------------------------------");
        TestClass.ListLambda();
    }
}
