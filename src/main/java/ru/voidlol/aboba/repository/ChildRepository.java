package ru.voidlol.aboba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.voidlol.aboba.domain.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {
}
