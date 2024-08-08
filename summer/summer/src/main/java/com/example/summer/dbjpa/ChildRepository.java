package com.example.summer.dbjpa;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Integer> {
    Child save(Child child);
}
