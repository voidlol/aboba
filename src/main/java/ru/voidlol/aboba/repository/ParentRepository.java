package ru.voidlol.aboba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.voidlol.aboba.domain.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
