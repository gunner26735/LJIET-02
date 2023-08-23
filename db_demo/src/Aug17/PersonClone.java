package Aug17;

public class PersonClone implements Cloneable {
    private String first_name,last_name;

    @Override
    public String toString() {
        return "PersonClone [first_name=" + first_name + ", last_name=" + last_name + "]";
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        PersonClone p1 = (PersonClone)o;
        
        if(first_name == null){
            if(p1.first_name != null)
                return false;
        }
        else if(!first_name.equals(p1.first_name))
            return false;

        if (p1.last_name == null) {
            if (p1.last_name != null) {
                return false;
            }
        }
        else if (!last_name.equals(p1.last_name)) {
            return false;
        }
        return true;
    }

    @Override
    public Object clone()throws CloneNotSupportedException {
        PersonClone obj = (PersonClone)super.clone();
        return obj;
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        PersonClone p1 = new PersonClone();
        p1.setFirst_name("ABC");
        p1.setLast_name("XYZ");
        System.out.println(p1);

        
        PersonClone p2 = (PersonClone) p1.clone();
        System.out.println("-----------------------");
        System.out.println(p2);

        boolean my_equal = p1.equals(p2);
        System.out.println("My EQUALS: "+my_equal);
        System.out.println("--------");
        System.out.println("p1-hashcode"+p1.hashCode());
        System.out.println("p2-hashcode"+p2.hashCode());

        PersonClone p3 = new PersonClone();
        System.out.println(p3.getClass());

        PersonClone p4 = new PersonClone();
        p4.setFirst_name("CDE");
        p4.setLast_name("PQR");


        PersonClone p5 = new PersonClone();
        p5.setFirst_name("CDE");
        p5.setLast_name("PQR");

        System.out.println("-------------------------");
        System.out.println("p4-hashcode"+p4.hashCode());
        System.out.println("p5-hashcode"+p5.hashCode());

        System.out.println(p4);
        System.out.println(p5);

        boolean my_equal1 = p4.equals(p5);
        System.out.println("My EQUALS 1: "+my_equal1);
    }
}
