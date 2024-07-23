package com.example.summer.trip;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class AccommodationRepository {
//    map은 db라 변수명은 스네이크 케이스로 하기도 함
//    private Map<Integer, String> trip_table = new HashMap<>();
    private Map<Integer, String> tripTable = new HashMap<>();
    private Map<Integer, Accommodation> accommodationTable = new HashMap<>();
    private int idx = 0;

    AccommodationRepository(){
        tripTable.put(0, "파라스파라 서울");
    }

    public String getProduct() {
        return tripTable.get(0);
    }

    public String saveProduct(String name) {
        tripTable.put(idx++, name);
        return tripTable.get(idx-1);
    }

    public Accommodation getAccomodationById(String id) {
        return accommodationTable.get(Integer.parseInt(id));
    }

    public Accommodation save(Accommodation hotelVO) {
        accommodationTable.put(idx++, hotelVO);
        return accommodationTable.get(idx-1);
    }

    public Accommodation saveAccommodation(Accommodation accommodation) {
        accommodation.setId(idx);
        accommodationTable.put(idx++, accommodation);
        return accommodationTable.get(idx-1);


    }

    public List<Accommodation> findAllAccomodation() {
        return accommodationTable.values().stream().toList();
    }

    public String getAccommodation(int id) {
        if(accommodationTable.get(id) != null)
            return accommodationTable.get(id).getName();
        else
            return null;
    }
}
