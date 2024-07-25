package com.example.summer.room;

import com.example.summer.exception.RoomNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {
    Map<Integer, Room> roomTable = new HashMap<>();
    int idx = 0;

    public Room getRoom(int id) {
        Room foundRoom = roomTable.get(id);
        try{
            if(foundRoom != null) return foundRoom;
            throw new RoomNotFoundException();
        }catch (RoomNotFoundException e){
            System.out.println(e.getMessage());
//            return new NullRoom();
            throw e;
        }
    }
}
