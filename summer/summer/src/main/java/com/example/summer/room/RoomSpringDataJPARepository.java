package com.example.summer.room;


import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Primary
public interface RoomSpringDataJPARepository extends JpaRepository<Room, Integer>, RoomRepository {
}
