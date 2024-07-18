package com.example.summer.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TripService {
    private TripRepository tripRepository;

    @Autowired
    TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public String getProduct() {
        return tripRepository.getProduct();
    }

    public boolean registerProduct(String product) {
        return tripRepository.saveProduct(product).equals(product);
    }

    public String getProductById(String id) {
        return tripRepository.findProductById(id);
    }

    public String registerHotel(Hotel hotelVO) {
        return tripRepository.save(hotelVO).getName();
    }
}
