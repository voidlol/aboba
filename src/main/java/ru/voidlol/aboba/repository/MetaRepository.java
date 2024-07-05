package ru.voidlol.aboba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.voidlol.aboba.domain.Meta;

@Repository
public interface MetaRepository extends JpaRepository<Meta, Long> {
}
