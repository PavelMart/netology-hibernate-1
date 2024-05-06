package ru.netology.hibernate.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Person {
    String name;
    String surname;
    int age;
}
