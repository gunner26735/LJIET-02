package customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Name is Required!")
    private String name;
    @Min(1)
    private Integer order_id;
    @Min(1)
    private Integer phone;
    @NotBlank(message = "Email is Required!")
    private String email;
    
    public Customer(Integer id, String name, Integer order_id, Integer phone, String email) {
        this.id = id;
        this.name = name;
        this.order_id = order_id;
        this.phone = phone;
        this.email = email;
    }

    public Customer(){}
    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getOrder_id() {
        return order_id;
    }
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }
    public Integer getPhone() {
        return phone;
    }
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", order_id=" + order_id + ", phone=" + phone + ", email="
                + email + "]";
    }

}
