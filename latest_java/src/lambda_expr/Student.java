package lambda_expr;

public class Student {
    int id;
    String name,stream;
    double percentage;
    
    public Student(){
        System.out.println("Default");
    }

    public Student(int id, String name, String stream, double percentage) {
        this.id = id;
        this.name = name;
        this.stream = stream;
        this.percentage = percentage;
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
    public String getStream() {
        return stream;
    }
    public void setStream(String stream) {
        this.stream = stream;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", stream=" + stream + ", percentage=" + percentage + "]";
    }

}
