package mm.bookingapp.controllers;

import mm.bookingapp.models.Place;
import mm.bookingapp.services.PlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/places")
public class PlacesController {
    @Autowired
    private PlacesService placesService;

    @GetMapping(path = "/v1/all")
    public List<Place> getAllPlaces() {
        return placesService.getAllPlaces();
    }


}
