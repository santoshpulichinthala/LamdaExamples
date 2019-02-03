package entitymappings;


import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int personId;
    private int personName;
    @OneToOne(cascade = CascadeType.ALL,fetch= FetchType.EAGER)
    @JoinColumn(name="pDEtail_Fk")
    private PersonDetails personDetails;

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPersonName() {
        return personName;
    }

    public void setPersonName(int personName) {
        this.personName = personName;
    }

}
