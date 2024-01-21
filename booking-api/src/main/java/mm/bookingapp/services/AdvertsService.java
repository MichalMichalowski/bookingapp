package mm.bookingapp.services;

import lombok.AllArgsConstructor;
import mm.bookingapp.dtos.AdvertDTO;
import mm.bookingapp.entities.AdvertEntity;
import mm.bookingapp.entities.PlaceDataViewEntity;
import mm.bookingapp.models.Advert;
import mm.bookingapp.repositories.AdvertsEntityRepository;
import mm.bookingapp.repositories.PlacesEntityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AdvertsService {

    private final PlacesEntityRepository placesEntityRepository;
    private final AdvertsEntityRepository advertsEntityRepository;

    public List<Advert> getAllAdvertsWithPlace() {
        List<AdvertEntity> advertEntities = advertsEntityRepository.findAll();
        return advertEntities.stream()
                .map(e -> placesEntityRepository.findById(e.getPlaceId())
                        .map(place -> Advert.builder()
                                .id(e.getId())
                                .userId(e.getUserId())
                                .placeId(e.getPlaceId())
                                .placeName(place.getPlaceName())
                                .placeDescription(place.getPlaceDescription())
                                .company(place.getCompany())
                                .firstName(place.getFirstName())
                                .lastName(place.getLastName())
                                .cityName(place.getCityName())
                                .streetName(place.getStreetName())
                                .postalCode(place.getPostalCode())
                                .streetNum(place.getStreetNum())
                                .apartmentNum(place.getApartmentNum())
                                .build())
                        .orElse(null))
                .collect(Collectors.toList());
    }

    public ResponseEntity<String> addNewAdvert(AdvertDTO advert) {
        Long result = advertsEntityRepository.addAdvert(
                advert.getUserId(), advert.getPlaceName(), advert.getPlaceDescription(),
                advert.getCityName(), advert.getStreetName(), advert.getPostalCode(),
                advert.getStreetNum(), advert.getApartmentNum()
        );

        if (result == -1) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User data not found");
        }

        return ResponseEntity.status(HttpStatus.OK).body("New advert successfully added");
    }
}
