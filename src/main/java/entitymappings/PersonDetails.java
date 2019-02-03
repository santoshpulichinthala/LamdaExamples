package entitymappings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetails {

    @Id
    @GeneratedValue
    @Column(name = "detailId_Fk")
    private int personDetailsID;
    private String job;

    public int getPersonDetailsID() {
        return personDetailsID;
    }

    public void setPersonDetailsID(int personDetailsID) {
        this.personDetailsID = personDetailsID;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
