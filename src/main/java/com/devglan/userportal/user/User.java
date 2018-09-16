package com.devglan.userportal.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String ime;
    private String geslo;

    protected User() {}

    public User(String ime) {
        this.ime = ime;
    }


    public Long getId() {
        return id;
    }

    public String getIme() {
        return this.ime;
    }

    public String getGeslo() {
        return geslo;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setGeslo(String geslo) {
        this.geslo = geslo;
    }
}
