package com.devglan.userportal;


import com.google.gson.JsonElement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Kategorija {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String ime;


    public void setId(Long id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    protected Kategorija() {}

    protected Kategorija(String ime) {
        this.ime = ime;
    }

    public Long getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }
}
