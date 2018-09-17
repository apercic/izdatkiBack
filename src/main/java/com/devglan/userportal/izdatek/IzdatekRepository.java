package com.devglan.userportal.izdatek;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IzdatekRepository extends CrudRepository<Izdatek, Long> {

    Izdatek findById(int id);

}
