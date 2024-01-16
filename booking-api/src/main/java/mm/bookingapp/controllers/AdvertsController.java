package mm.bookingapp.controllers;

import lombok.AllArgsConstructor;
import mm.bookingapp.models.Advert;
import mm.bookingapp.services.AdvertsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
