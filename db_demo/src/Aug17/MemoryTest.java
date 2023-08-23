package Aug17;

class GCTest{

    String name;
    static int counter =0;

    public GCTest(){
        name = "Object No. "+ ++counter;
        System.out.println(name);
    }

    public static int getCounter(){
        return counter;
    }

    public void finalize(){
        System.out.println("finalize is called ....");
        System.out.println(--counter);
    }
}

public class MemoryTest {
    public static void main(String[] args)throws Exception {
        // Runtime r = Runtime.getRuntime();
        // System.out.println("Total Memory ="+r.totalMemory());
        // System.out.println("Free Memmory ="+r.freeMemory());
        
        // for(int i=0;i<10000;i++){
        //     new MemoryTest();
        // }
        // System.out.println("After Creating 1000 Objects "+r.freeMemory());
        // System.gc();
        // System.out.println(r.freeMemory());

        GCTest g1 = new GCTest();
        // GCTest g2 = new GCTest();

        // g1 = null;
        // g2 = null;

        // System.gc();

        while(GCTest.getCounter() < 10000){
            g1 = new GCTest();
            System.gc();
        }


    }   
}
