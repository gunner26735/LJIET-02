package com.assignment;

public class DStudent {
    private int rollno;
    private String name;
    
    @Override
    public String toString() {
        return "DStudent [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
    }

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private DAddress address;

}
