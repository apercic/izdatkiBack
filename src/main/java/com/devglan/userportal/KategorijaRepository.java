package com.devglan.userportal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategorijaRepository extends CrudRepository<Kategorija, Long> {

    Kategorija findById(int id);
}
