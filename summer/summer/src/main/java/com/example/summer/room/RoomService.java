package com.example.summer.room;

import com.example.summer.exception.RoomNotFoundException;
import com.example.summer.room.dto.RoomRegisterReq;
import jakarta.transaction.Transactional;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;
    private final RoomJPARepository roomJPARepository;

    @Autowired
    public RoomService(RoomRepository roomRepository, RoomJPARepository roomJPARepository){
        this.roomRepository = roomRepository;
        this.roomJPARepository = roomJPARepository;
    }

    
//    방을 저장하는 역할인 것이지, 저장하는 역할은 얘의 책임이 아님
//    다른 곳에 떼서 사용할 수 있다는 것
//
    @Transactional
    public void saveRoom(RoomRegisterReq roomRegisterReq) {
        // 1
        // 원화 -> 달러 로직(Entity, DTO)
        // 2
        
//        어디에 객체 변환을 넣어야 둘까
//2번에 둔다는 것은 Repository에 두기 직전에 바뀐다는 것
//        roomRepository.save(roomRegisterReq.toEntity());
        roomJPARepository.save(roomRegisterReq.toEntity());
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


}
