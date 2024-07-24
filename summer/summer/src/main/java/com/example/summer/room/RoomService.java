package com.example.summer.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public Room getRoom(int id){
        return roomRepository.getRoom(id);
    }
}
