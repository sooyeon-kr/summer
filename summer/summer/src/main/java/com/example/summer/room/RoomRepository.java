package com.example.summer.room;

import com.example.summer.exception.RoomNotFoundException;
import jakarta.persistence.EntityManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class RoomRepository {

    EntityManager entityManager;

    Map<Integer, Room> roomTable = new HashMap<>();
    int idx = 0;

    @Autowired
    public RoomRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Room room) {
        entityManager.persist(room);
    }

    public Room getRoom(int id)  {
        return entityManager.find(Room.class, id);
//        Room foundRoom = roomTable.get(id);
//        try{
//            if(foundRoom != null) return foundRoom;
//            throw new RoomNotFoundException();
//        }catch (RoomNotFoundException e){
//            System.out.println(e.getMessage());
////            return new NullRoom();
//            throw e;
//        }
    }


}
