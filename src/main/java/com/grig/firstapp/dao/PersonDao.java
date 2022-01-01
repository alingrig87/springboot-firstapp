package com.grig.firstapp.dao;

import com.grig.firstapp.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    Optional<Person> selectPersonById(UUID id);

    List<Person> getAllPersons();

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person newPerson);


}
