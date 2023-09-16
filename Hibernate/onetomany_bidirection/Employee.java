package onetomany_bidirection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int eid;
    String ename,eemail;
    
    @ManyToOne
    @JoinColumn(name = "d_id")
    Department myDepartment;
    
    public Department getMyDepartment() {
        return myDepartment;
    }
    public void setMyDepartment(Department myDepartment) {
        this.myDepartment = myDepartment;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getEemail() {
        return eemail;
    }
    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

}
