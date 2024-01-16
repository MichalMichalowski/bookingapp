package mm.bookingapp.services;

import mm.bookingapp.entities.PlaceDataViewEntity;
import mm.bookingapp.models.Place;
import mm.bookingapp.repositories.PlacesEntityRepository;
import mm.bookingapp.utils.EntitiesConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlacesService {

    @Autowired
    private PlacesEntityRepository placesEntityRepository;

    public List<Place> getAllPlaces() {
        List<PlaceDataViewEntity> placesEntities = placesEntityRepository.findAll();
        return placesEntities.stream().map(
                EntitiesConverter::placeEntityToPlaceModel).collect(Collectors.toList());
    }
}
