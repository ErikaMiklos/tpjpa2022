package jpa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.util.Date;

@Entity
public class Rdv {
    private long idR;
    private Date date;
    private Time heure;

    private Prof prof;
    private Eleve eleve;

    public Rdv() {
    }

    public Rdv(long idR, Date date, Time heure, Prof prof, Eleve eleve) {
        this.idR = idR;
        this.date = date;
        this.heure = heure;
        this.prof = prof;
        this.eleve = eleve;
    }

    @Id
    @GeneratedValue
    public long getIdR() {
        return idR;
    }

    public void setIdR(long idR) {
        this.idR = idR;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHeure() {
        return heure;
    }

    public void setHeure(Time heure) {
        this.heure = heure;
    }

    @ManyToOne
    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    @ManyToOne
    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    @Override
    public String toString() {
        return "Rdv{" +
                "idR=" + idR +
                ", date=" + date +
                ", heure=" + heure +
                '}';
    }
}
