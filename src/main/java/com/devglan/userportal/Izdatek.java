package com.devglan.userportal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Izdatek {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String datum;
    private String grupa;
    private Double vrednost;

    protected Izdatek() {}

    public Izdatek(String datum, String grupa, Double vrednost) {
        this.datum = datum;
        this.grupa = grupa;
        this.vrednost = vrednost;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public void setVrednost(Double vrednost) {
        this.vrednost = vrednost;
    }

    public Long getId() {
        return id;
    }

    public String getDatum() {
        return this.datum;
    }

    public Double getVrednost() {
        return vrednost;
    }

    public String getGrupa() {
        return this.grupa;

    }
}
