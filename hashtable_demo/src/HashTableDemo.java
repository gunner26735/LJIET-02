import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        //WHat is a Hash
        String s1 = new String("Hellooo");
        System.out.println("This is a HASH: "+s1.hashCode());
        hashTable1();
    }

    public static void hashTable1(){
        Hashtable<Integer,String> demoHTable = new Hashtable<Integer,String>();
        demoHTable.put(1,"Hey");
        demoHTable.put(2,"What");
        demoHTable.put(3,"is");
        demoHTable.put(4,"Going");
        System.out.println(demoHTable);
        System.out.println(demoHTable.get(1));

        //To print Hashes Enumeration Iterator are used instead of Iterator.
        Enumeration showHTable = demoHTable.keys();
        while(showHTable.hasMoreElements()){
            Object object1 = (Object) showHTable.nextElement();
            System.out.println("Object : "+demoHTable.get(object1));
        }

        //METHODS
        System.out.println("Hash Size : "+demoHTable.size());
        System.out.println("Hash Contains : "+demoHTable.contains("Going"));
        System.out.println("Hash Empy? : "+demoHTable.isEmpty());
        demoHTable.clear();
        System.out.println("Hash Clear : "+ demoHTable);
    }
}
