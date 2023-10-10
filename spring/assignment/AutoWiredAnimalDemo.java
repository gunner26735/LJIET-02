package com.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
class Animal{
    @Autowired
    private Dog dog;

    @Autowired
    private Snake snake;
    
    @Autowired
    private Bat bat;

    public void setValues(){
        dog.setLegs(4);
        dog.setCategory("Omnivores");

        bat.setLegs(2);
        bat.setCategory("Omnivores");

        snake.setLegs(0);
        snake.setCategory("Carnivores");
    }

    @Override
    public String toString() {
        return "Animal [dog=" + dog + ", snake=" + snake + ", bat=" + bat + "]";
    } 
}

@Component
class Dog{
    private int legs;
    private String category;

    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Dog [legs=" + legs + ", category=" + category + "]";
    }

}

@Component
class Snake{
    private int legs;
    private String category;

    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Snake [legs=" + legs + ", category=" + category + "]";
    }
}

@Component
class Bat{
    private int legs;
    private String category;

    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Bat [legs=" + legs + ", category=" + category + "]";
    }
}

@ComponentScan(basePackages = {"com.assignment"})
public class AutoWiredAnimalDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AutoWiredAnimalDemo.class);
        context.refresh();
        

        Animal a1 = context.getBean("animal",Animal.class);
        a1.setValues();
        System.out.println(a1);

    }
}
