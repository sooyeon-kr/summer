package com.example.summer.trip;

import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    public Optional<Accommodation> getAccommodation(int id) {

        Accommodation foundAccommodation = accommodationTable.get(id);
        Optional<Accommodation> optional = Optional.ofNullable(foundAccommodation);
        //NPE가 터지지 않도록, 한겹싸서 보내주는 건 어때? null 포장 -> 포장을 까기전까지는 null인지 모를거야
//        JAVA에서 이 포장지를 Optional이라고 함, JPA는 포장 객체를 한겹싸서 줌 그래서 JPA는 옵셔널로 반환해주기때문에 세트로 다니는 것 뿐
        return optional;
    }
}
