package onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name = "puser")
public class PhoneUser {
    @Id
    int uid;
    String uname;
    String uaddress;

    @JoinColumn(name = "user_id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Phone> phones;
    
    @Override
    public String toString() {
        return "PhoneUser [uid=" + uid + ", uname=" + uname + ", uaddress=" + uaddress + ", phones=" + phones + "]";
    }
    public List<Phone> getPhones() {
        return phones;
    }
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUaddress() {
        return uaddress;
    }
    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

}
