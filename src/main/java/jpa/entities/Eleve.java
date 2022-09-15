package jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Eleve extends User {

    private double grade;
    private List<Rdv> rdvs = new ArrayList<Rdv>();
    public Eleve() {
    }

    public Eleve(double grade) {

        this.grade = grade;
    }


    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
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
