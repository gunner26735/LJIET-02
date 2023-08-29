package demo_junit;

import java.util.Scanner;

class NameNotNullException extends Exception{
    NameNotNullException(String s){
        super(s);
    }
}

class PhoneLengthException extends Exception{
    public PhoneLengthException(String s){
        super(s);
    }
}

class Employee {
    String fname, lname, addrs;
    int phone;

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee [fname=" + fname + ", lname=" + lname + ", addrs=" + addrs + ", phone=" + phone + "]";
    }
}

public class Assignment {
    public static void main(String[] args) throws NameNotNullException,PhoneLengthException,NumberFormatException {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter Employee Details Below: ");

        System.out.println("Enter First Name:");
        str = sc.nextLine();
        validateFname(str,emp);

        System.out.println("Enter Last Name:");
        str = sc.nextLine();
        validateLname(str,emp);

        System.out.println("Enter Phone Name:");
        str = sc.nextLine();
        validatePhone(str,emp);

        System.out.println("Enter address:");
        str = sc.nextLine();
        emp.setAddrs(str);

        System.out.println(emp.toString());
    }

    static void validateFname(String s,Employee _e) {
        try {
            if (s == null || s.equals("")) {
                throw new NameNotNullException("First Name Cannot Be Null or Empty");
            }
            else{
                _e.setFname(s);
            }
        } catch (NameNotNullException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateLname(String s,Employee _e) {
        try {
            if (s == null || s.equals("")) {
                throw new NameNotNullException("Last Name Cannot Be Null or Empty");
            }
            else{
                _e.setLname(s);
            }
        } catch (NameNotNullException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validatePhone(String s,Employee _e) {
        try {
            if (s.length() != 10) {
                throw new PhoneLengthException("Length of Phone Number should be exactly 10..");
            }
            else{
                int i = Integer.parseInt(s);
                _e.setPhone(i);
            }
        } catch (PhoneLengthException e) {
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Phone Number should be Numeric only");
        }
    }
}
