package mm.bookingapp.controllers;

import lombok.AllArgsConstructor;
import mm.bookingapp.dtos.AdvertDTO;
import mm.bookingapp.models.Advert;
import mm.bookingapp.services.AdvertsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/adverts")
@AllArgsConstructor
public class AdvertsController {

    private final AdvertsService advertsService;

    @GetMapping(path = "/v1/all")
    List<Advert> getAllAdverts() {
        return advertsService.getAllAdvertsWithPlace();
    }

    @PostMapping(path = "/v1/add-advert")
    ResponseEntity<String> addNewAdvert(@RequestBody AdvertDTO advert) {
        return advertsService.addNewAdvert(advert);
    }

}
