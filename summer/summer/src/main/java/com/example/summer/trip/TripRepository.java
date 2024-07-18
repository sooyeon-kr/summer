package com.example.summer.trip;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class TripRepository {
//    map은 db라 변수명은 스네이크 케이스로 하기도 함
//    private Map<Integer, String> trip_table = new HashMap<>();
    private Map<Integer, String> tripTable = new HashMap<>();
    private int idx = 0;

    TripRepository(){
        tripTable.put(0, "파라스파라 서울");
    }

    public String getProduct() {
        return tripTable.get(0);
    }

    public String saveProduct(String name) {
        tripTable.put(idx++, name);
        return tripTable.get(idx-1);
    }

    public String findProductById(String id) {
        return tripTable.get(Integer.parseInt(id));
    }
}
