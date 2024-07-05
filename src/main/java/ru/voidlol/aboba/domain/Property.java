package ru.voidlol.aboba.domain;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Table(name = "property")
@IdClass(PropertyId.class)
@Setter
public class Property {

    @Id
    @ManyToOne
    @JoinColumn(name = "meta_id", referencedColumnName = "id")
    private Meta meta;
    @Id
    @ManyToOne
    @JoinColumn(name = "child_id", referencedColumnName = "id")
    private Child child;
    private String value;
}
