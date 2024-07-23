package com.example.summer.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccommodationService {
    private final AccommodationRepository accommodationRepository;
    private AccommodationRepository tripRepository;

    @Autowired
    AccommodationService(AccommodationRepository tripRepository, AccommodationRepository accommodationRepository) {
        this.tripRepository = tripRepository;
        this.accommodationRepository = accommodationRepository;
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

    public String registerHotel(Accommodation hotelVO) {
        return tripRepository.save(hotelVO).getName();
    }

    public Accommodation addAccommodation(AccommodationAddRequest accommodation) {
        return accommodationRepository.saveAccommodation(accommodation.to());
    }
}
