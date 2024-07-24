package com.example.summer.trip;

public class AccommodationGetAllResponse {
    private int id;
    private String name;

    public AccommodationGetAllResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static AccommodationGetAllResponse from(Accommodation accommodation) {
        return new AccommodationGetAllResponse(accommodation.getId(), accommodation.getName());
    }
}
