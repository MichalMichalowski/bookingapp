package mm.bookingapp.services;

import lombok.AllArgsConstructor;
import mm.bookingapp.entities.PlaceDataViewEntity;
import mm.bookingapp.repositories.PlacesEntityRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PlacesService {

    private final PlacesEntityRepository placesEntityRepository;

    public Optional<PlaceDataViewEntity> getPlaceById(Long id) {
        return placesEntityRepository.findById(id);
    }
}
