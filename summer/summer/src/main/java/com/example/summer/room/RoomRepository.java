package com.example.summer.room;

import com.example.summer.exception.RoomNotFoundException;
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

    @Autowired
    DataSource dataSource;

    Map<Integer, Room> roomTable = new HashMap<>();
    int idx = 0;


    public void makeConnection(){
        System.out.println(DataSourceUtils.getConnection(dataSource));
    }

    public Room getRoom(int id)  {

        makeConnection();
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
