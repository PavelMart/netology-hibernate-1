package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.PersonEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

    @Query("select p from PersonEntity p where p.cityOfLiving = :city")
    List<PersonEntity> findByCityOfLiving(String city);

    @Query("select p from PersonEntity p where p.person.age < :age order by p.person.age ASC")
    List<PersonEntity> findByAgeLessThat(int age);

    @Query("select p from PersonEntity p where p.person.name = :name and p.person.surname = :surname")
    Optional<PersonEntity> findByNameAndSurname(String name, String surname);
}
