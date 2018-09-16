package com.devglan.userportal.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;


import static org.springframework.web.bind.annotation.RequestMethod.*;


@CrossOrigin(origins = {"*"}, maxAge = 3600)
@RestController

public class UserController {
    @Autowired
    private UserRepository repository;
    public void setRepository(UserRepository repository){
        this.repository = repository;
    }

    @RequestMapping(value="/existsUser", method=POST)
    public String index(@RequestBody User bb) {
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        /*System.out.println(Jwts.parser().setSigningKey(key).parseClaimsJws(jws).getBody());//*/
        List<User> mm = repository.findOne(bb.getIme(), bb.getGeslo());
        if (mm.size() > 0)
            return Jwts.builder().setSubject("").claim("user", bb).signWith(key).compact();
        else
            return null;
    }

    @RequestMapping(value="/saveUser", method=POST)
    public void saveToDB(@RequestBody User bla) {
        repository.save(bla);
    }

    @RequestMapping(value="/deleteUser", method=DELETE)
    public void zbrisiZapis(@RequestBody User bla) {
        repository.delete(bla);
    }
}
