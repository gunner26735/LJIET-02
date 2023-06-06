package june6_ass;

import java.util.Scanner;

class Student{
    private int roll_no,marks;
    private String student_name;

    @Override
    public String toString() {
        return "Student [roll_no=" + roll_no + ", marks=" + marks + ", student_name=" + student_name + "]";
    }

    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll_no");
        roll_no = sc.nextInt();
        System.out.println("Enter name");
        student_name = sc.next();
        System.out.println("Enter marks");
        marks = sc.nextInt();
    }

}


public class DoWhile_AOB {
    public static void main(String[] args) {
        Student s[] = new Student[5];
        int count =0;
        char cont = 'y';
        Scanner sc = new Scanner(System.in);
        do{
            s[count] = new Student();
            s[count].setData();
            System.out.println("Do you want add new Student(y/N): ");
            cont = sc.nextLine().charAt(0);
            count++;
        }while(count < 5 && (cont == 'y' || cont == 'Y'));

        for(int i=0;i<count;i++){
            System.out.println(s[i]);
        }
    }
}
