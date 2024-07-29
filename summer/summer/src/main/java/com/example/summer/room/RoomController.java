package com.example.summer.room;

import com.example.summer.room.dto.RoomRegisterReq;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping("/rooms")
    public void saveRoom(@RequestBody RoomRegisterReq roomRegisterReq) {
       roomService.saveRoom(roomRegisterReq);
    }

    @RequestMapping(value = "/rooms/{id}", method = RequestMethod.GET)
    public String getRoom(@PathVariable("id") int id) {
        return roomService.getRoom(id).getType();
    }



}
