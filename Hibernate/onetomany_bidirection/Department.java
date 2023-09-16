package onetomany_bidirection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name = "dept")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int d_id;
    String dname;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Employee> empSet = new HashSet<Employee>(0);
    
    public Set<Employee> getEmpSet() {
        return empSet;
    }
    public void setEmpSet(Set<Employee> empSet) {
        this.empSet = empSet;
    }
    public int getD_id() {
        return d_id;
    }
    public void setD_id(int d_id) {
        this.d_id = d_id;
    }
    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
}
