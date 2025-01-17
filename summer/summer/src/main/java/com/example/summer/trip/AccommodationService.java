package com.example.summer.trip;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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

//    public String getAccomodationById(String id) {
//        return tripRepository.getAccomodationById(id);
//    }

    public String registerHotel(Accommodation hotelVO) {
        return tripRepository.save(hotelVO).getName();
    }

    public Accommodation addAccommodation(AccommodationAddRequest accommodation) {
        return accommodationRepository.saveAccommodation(accommodation.to());
    }

    public List<AccommodationGetAllResponse> getAllAccommodation() {
        List<Accommodation> accommodations = accommodationRepository.findAllAccomodation();
        List<AccommodationGetAllResponse> responses = accommodations.stream()
                .map(AccommodationGetAllResponse::from)
                .collect(Collectors.toList());

        return responses;
    }


    public String getAccommodationName(int id) {
        Optional<Accommodation> getAccommodation = accommodationRepository.getAccommodation(id);
//        return getAccommodation.orElse(new Accommodation("없는 숙소")).getName();
        return accommodationRepository.getAccommodation(id)
                .map(Accommodation::getName)
                .orElse("없는 숙소");

    }

    public String testExceptionAccommodation(int id) {
        return accommodationRepository.testExceptionAccommodation(id);
    }
}
