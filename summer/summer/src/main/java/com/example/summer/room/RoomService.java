package com.example.summer.room;

import com.example.summer.exception.RoomNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public Room getRoom(int id){
        try{
            return roomRepository.getRoom(id);
        }catch(RoomNotFoundException e){
            System.out.println(e.getMessage());
            return new NullRoom();
        }

    }
}
