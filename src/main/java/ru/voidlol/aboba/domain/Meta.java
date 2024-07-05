package ru.voidlol.aboba.domain;

import jakarta.persistence.*;

@Table(name = "meta")
@Entity
public class Meta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
}
