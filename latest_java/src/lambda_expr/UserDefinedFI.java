package lambda_expr;

//It is a Test class for User Definied Functional Interfaces along with Lambda Expressions
@FunctionalInterface //This is optional annotation
interface InterfaceNew{
    public void hello(String name);
}

@FunctionalInterface
interface InterfaceCube{
    int calculateCube(int i);
}

public class UserDefinedFI {
    public static void cube(){
        InterfaceCube calculateCube = (num)->{
            return(num*num*num);
        };
        System.out.println("Cube Without Lambda:"+calculateCube.calculateCube(10));

        InterfaceCube c1 = (num)->num*num*num;
        System.out.println("Cube With Lambda:"+c1.calculateCube(5));
    }

    public static void test1(){
        InterfaceNew myNew = (name)->{
            System.out.println("hello "+name);
        };
        myNew.hello("XYZ");

        InterfaceNew i1 = (name)->System.out.println("Name is :"+name);
        i1.hello("POQ");
    }

    public static void main(String[] args) {
        //UserDefinedFI.cube();
        UserDefinedFI.test1();
    }
}
