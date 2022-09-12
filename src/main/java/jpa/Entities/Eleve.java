package jpa.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Eleve extends User {

    private String grade;
    private List<Rdv> rdvs = new ArrayList<Rdv>();
    public Eleve() {
    }

    public Eleve(String grade) {

        this.grade = grade;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @OneToMany(mappedBy = "eleve", cascade = CascadeType.PERSIST)
    public List<Rdv> getRdvs() {
        return rdvs;
    }

    public void setRdvs(List<Rdv> rdvs) {
        this.rdvs = rdvs;
    }

    @Override
    public String toString() {
        return "Eleve{" +
                ", grade='" + grade + '\'' +
                '}';
    }
}
