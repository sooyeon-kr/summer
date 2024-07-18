package com.example.summer.trip;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class TripRepository {
    private Map<String, String> tripDB = new HashMap<>();


    TripRepository(){
        tripDB.put("파라스파라 서울", "파라스파라 서울");
    }

    public String getProduct() {
        return tripDB.get("파라스파라 서울");
    }
}
