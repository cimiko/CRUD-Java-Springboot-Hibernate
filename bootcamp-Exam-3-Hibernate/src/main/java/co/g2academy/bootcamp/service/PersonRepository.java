/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.service;

import co.g2academy.bootcamp.entity.Person;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cimiko
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Object>{
    
    Person findByName(String userName);
    
    List<Person> findAll();
    
}
