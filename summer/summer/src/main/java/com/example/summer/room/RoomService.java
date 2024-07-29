package com.example.summer.room;

import com.example.summer.exception.RoomNotFoundException;
import jakarta.transaction.Transactional;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    public Room getRoom(int id) {
        return roomRepository.getRoom(id);
//        try{
//            return roomRepository.getRoom(id);
//        }catch(RoomNotFoundException e){
//            System.out.println(e.getMessage());
//            return new NullRoom();
//        }

    }

    @Transactional
    public void saveRoom(Room room) {
        roomRepository.save(room);

    }
}
