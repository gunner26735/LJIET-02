package com.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
class Person{
    private String name;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Person [name=" + name + "]");
    }

    @Autowired
    private Address addr;

    @Override
    public String toString() {
        return "Person [name=" + name + ", addr=" + addr + "]";
    }
}

@Component
class Address{
    private int id;
    private String city;
    
    @Override
    public String toString() {
        return "Address [id=" + id + ", city=" + city + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public void details() {
        System.out.println("Address [id=" + id + ", city=" + city + "]");
    }
}


@Component("bean2")
public class AutoWireWithoutXMLAssn {
    @Autowired
    Person p1;

    @Autowired
    Address a1;
 
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.assignment");
		AutoWireWithoutXMLAssn obj = (AutoWireWithoutXMLAssn) context.getBean("bean2");

        obj.p1.setName("Allen");
        obj.a1.setId(1);
        obj.a1.setCity("Banglore");

        System.out.println(obj.p1);
    }
}