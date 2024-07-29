package com.example.summer.room;

public interface RoomRepository {
    Room save(Room entity);

    Room getRoom(int id);
}
