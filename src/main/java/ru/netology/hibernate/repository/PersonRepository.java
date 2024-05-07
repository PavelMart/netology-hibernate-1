package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.PersonEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
    List<PersonEntity> findByCityOfLiving(String city);

    List<PersonEntity> findByPersonAgeLessThanOrderByPersonAgeAsc(int age);

    Optional<PersonEntity> findByPersonNameAndPersonSurname(String name, String surname);
}
