package com.devglan.userportal.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    //List<Customer> findByLastName(String ime);
    User findById(int id);

    @Query(value = "SELECT u FROM User u WHERE (u.ime = :ime AND u.geslo = :geslo)")
    List<User> findOne(@Param("ime") String ime, @Param("geslo") String geslo);
}