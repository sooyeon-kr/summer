package com.example.summer.trip;

import java.util.List;
import javax.swing.text.html.parser.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccommodationController {
    AccommodationService accommodationService;

    @Autowired
    AccommodationController(AccommodationService tripService) {
        this.accommodationService = tripService;
    }
    /*
    * localhos:8080/product, GET
    * :파라스파라 서울"
    * */
    @RequestMapping(value="/product", method = RequestMethod.GET)
    public String getProduct(){
        return accommodationService.getProduct();
    }

    /*
     * localhos:8080/products/, GET
     * path variable로 숫자 -> return 되어서 화면에 떴으면!
     */

//    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
//    public String getProductId(@PathVariable(value = "id") int id){
//        return id + "";
//    }

    /*
    * 쿼리 파라미터(스트링)로 숙소명을 받아서,
    * repository table 에 저장한 뒤,
    * "숙소명 상품 생성하였습니다"
     */
    @RequestMapping(value="/products")
    public String registerProduct(@RequestParam(value = "product") String product){
        String msg = product + " 상품 생성 ";
        accommodationService.registerProduct(product);
        return accommodationService.registerProduct(product) ? msg + "성공" : msg+"실패";
    }

    /*
    * path variable로 idx값을 받아서
    * repository에 맵핑되어 있는 value(호텔)을 출력해주세요
    * */
//    @RequestMapping(value="/accommodations/{id}", method = RequestMethod.GET)
//    public String getProductById(@PathVariable(value = "id") String id){
//        return accommodationService.getAccomodationById(id);
//    }

    @RequestMapping(value="/hotels", method = RequestMethod.POST)
    public String registerHotel(@RequestBody Accommodation hotel){
        return accommodationService.registerHotel(hotel).equals(hotel.getName()) ? "등록완료" : "등록실패";
    }

    @RequestMapping(value = "/accommodations", method = RequestMethod.POST)
    public ResponseEntity addAccommodation(@RequestBody AccommodationAddRequest accommodation) {
        Accommodation savedAccommodation = accommodationService.addAccommodation(accommodation);

        if(savedAccommodation != null)
            return new ResponseEntity<>(savedAccommodation, HttpStatus.CREATED);
        else {
            return new ResponseEntity<>("실패..", HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/accommodations", method = RequestMethod.GET)
    public ResponseEntity<List<AccommodationGetAllResponse>> getAllAccommodations(){
        List<AccommodationGetAllResponse> accommodations = accommodationService.getAllAccommodation();
        return new ResponseEntity<>(accommodations, HttpStatus.OK);
    }

    @RequestMapping(value = "/accommodations/{id}", method = RequestMethod.GET)
    public String getAccommodationName(@PathVariable(value = "id") int id){
        return accommodationService.getAccommodationName(id);
    }

}
