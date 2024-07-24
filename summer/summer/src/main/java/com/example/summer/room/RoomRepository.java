package com.example.summer.room;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {
    Map<Integer, Room> roomTable = new HashMap<>();
    int idx = 0;

    public Room getRoom(int id){
        return roomTable.get(id);
    }
}
