package ru.voidlol.aboba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.voidlol.aboba.domain.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
