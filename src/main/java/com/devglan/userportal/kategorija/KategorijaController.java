package com.devglan.userportal.kategorija;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:63342"}, maxAge = 3600)
@RestController


public class KategorijaController {
    @Autowired
    private KategorijaRepository repository;
    public void setRepository2(KategorijaRepository repository){
        this.repository = repository;
    }


    @RequestMapping(produces = "application/json", value="/getKategorije", method=GET)
    public Iterable<Kategorija> metodica() {
        return repository.findAll();
    }

    @RequestMapping(value="/saveKategorija", method=POST)
    public void saveKategorija(@RequestBody Kategorija bb) {
        repository.save(bb);
    }
}
