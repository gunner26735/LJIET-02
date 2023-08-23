package lambda_expr;

public class Employee {
    int id;
    String name;
    float Salary;

    public Employee(){
        
    }

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return Salary;
    }
    public void setSalary(float salary) {
        Salary = salary;
    }

}
