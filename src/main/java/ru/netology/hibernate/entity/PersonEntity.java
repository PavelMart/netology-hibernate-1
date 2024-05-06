package ru.netology.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(schema = "hibernate", name="persons")
public class PersonEntity {
    @EmbeddedId
    Person person;

    @Column(unique = true, length = 20)
    String phoneNumber;

    @Column(length = 50)
    String cityOfLiving;
}
