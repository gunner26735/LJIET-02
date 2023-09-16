package onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone")
public class Phone {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    int phone_id;
    int phone_no;
    String phone_type;
    int user_id;

    @Override
    public String toString() {
        return "Phone [phone_id=" + phone_id + ", phone_no=" + phone_no + ", phone_type=" + phone_type + ", user_id="
                + user_id + "]";
    }
    public int getPhone_id() {
        return phone_id;
    }
    public void setPhone_id(int phone_id) {
        this.phone_id = phone_id;
    }
    public int getPhone_no() {
        return phone_no;
    }
    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }
    public String getPhone_type() {
        return phone_type;
    }
    public void setPhone_type(String phone_type) {
        this.phone_type = phone_type;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
