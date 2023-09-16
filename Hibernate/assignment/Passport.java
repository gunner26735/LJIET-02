package assignment;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class Passport implements Serializable {
    @Id
    @Column(name = "passportId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    String issuer;

    /*@JoinColumn(name = "passportId")
    @OneToOne(cascade = CascadeType.ALL)
    Citizen myCitizen;
    
    public Citizen getMyCitizen() {
        return myCitizen;
    }
    public void setMyCitizen(Citizen myCitizen) {
        this.myCitizen = myCitizen;
    }*/
    
    public String getIssuer() {
        return issuer;
    }
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

}
