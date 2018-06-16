package com.devglan.userportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:63342"}, maxAge = 3600)
@RestController


public class IzdatekController {
    @Autowired
    private IzdatekRepository repository;
    public void setRepository(IzdatekRepository repository){
        this.repository = repository;
    }


    @RequestMapping(produces = "application/json", value="/get", method=GET)
    public Iterable<Izdatek> index() {
        return repository.findAll();
    }

    @RequestMapping(value="/save", method=POST)
    public void saveToDB(@RequestBody Izdatek bla) {
        repository.save(bla);
    }

    @RequestMapping(value="/delete", method=DELETE)
    public void zbrisiZapis(@RequestBody Izdatek bla) {
        repository.delete(bla);
    }
}
