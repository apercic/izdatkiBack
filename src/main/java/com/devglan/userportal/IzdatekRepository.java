package com.devglan.userportal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IzdatekRepository extends CrudRepository<Izdatek, Long> {

    //List<Customer> findByLastName(String ime);
    Izdatek findById(int id);

}
