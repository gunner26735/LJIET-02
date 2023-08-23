package java8;

interface InterfaceA{
    
    void show();
    
    //default may or may not be overridden
    default void print(){
        System.out.println("Default Method of Interface A");
    }

    default void print1(){
        System.out.println("Default Method 2 of Interface A");
    }

}

interface InterfaceB{
    default void print(){
        System.out.println("Default Method of Interface B");
    }

    static void display(){
        System.out.println("Display of Static Method from Interface B");
    } 
}

interface InterfaceC{
    static void display(){
        System.out.println("Display of Static Method");
    }

    static void display1(){
        System.out.println("Display 2 of Static Method");
    }
}

public class StaticMethodImplementation implements InterfaceA , InterfaceB , InterfaceC {
    public static void main(String[] args) {
        StaticMethodImplementation smi = new StaticMethodImplementation();
        smi.print();
        InterfaceC.display();

    }

    @Override
    public void show() {
        
    }

    //Bcz static method are prohibited to be overridden
    // @Override
    // static void display(){
    //     System.out.println("Display from Main");
    // }

    @Override
    public void print(){
        InterfaceA.super.print();
        InterfaceB.super.print();
        System.out.println("Default Method Overridden");
    }

}
