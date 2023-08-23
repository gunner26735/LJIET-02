package Aug17;


class Demo{

}

class Demo1{
    public Demo1(){
        System.out.println("DEMO 1 Default!!!");
    }

    @Override
    protected void finalize()throws Throwable{
        System.out.println("Finalize Called !!!");
    }
}


public class FinaliseDemo {
    
    public static void main(String[] args) throws Throwable {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        
        System.out.println(d1.getClass().getName());
        System.out.println("d1 hashcode:"+d1.hashCode());
        System.out.println("d2 hashcode:"+d2.hashCode());

        Demo1 d11 = new Demo1();
        System.out.println("d11 hashcode:"+d11.hashCode());

        Demo1 d12 = d11;
        System.out.println("d12 hashcode:"+d12.hashCode());

        d11 = null;

        System.gc();
        //d11.finalize();
        System.out.println("d11 obj = "+d11);
    }
}
