package mm.bookingapp.controllers;

import lombok.AllArgsConstructor;
import mm.bookingapp.models.PlaceData;
import mm.bookingapp.services.PlacesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/places")
@AllArgsConstructor
public class PlacesController {

    private final PlacesService placesService;


}
