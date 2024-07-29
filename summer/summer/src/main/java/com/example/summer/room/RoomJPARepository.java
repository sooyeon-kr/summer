package com.example.summer.room;

import com.example.summer.exception.RoomNotFoundException;
import jakarta.persistence.EntityManager;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoomJPARepository implements RoomRepository {

    EntityManager entityManager;

    Map<Integer, Room> roomTable = new HashMap<>();
    int idx = 0;

    @Autowired
    public RoomJPARepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Room save(Room room) {
        entityManager.persist(room);
        return room;
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
