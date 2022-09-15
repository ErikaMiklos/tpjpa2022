package jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Prof extends User{

    private String sujet;
    private List<Rdv> rdvs = new ArrayList<Rdv>();

    public Prof() {
    }

    public Prof(String sujet) {

        this.sujet = sujet;
    }


    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    @OneToMany(mappedBy = "prof", cascade = CascadeType.PERSIST)
    public List<Rdv> getRdvs() {
        return rdvs;
    }

    public void setRdvs(List<Rdv> rdvs) {
        this.rdvs = rdvs;
    }

    @Override
    public String toString() {
        return "Prof{" +
                ", sujet='" + sujet + '\'' +
                '}';
    }
}
