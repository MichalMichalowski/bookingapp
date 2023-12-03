package mm.bookingapp.utils;

import mm.bookingapp.entities.PlaceDataEntity;
import mm.bookingapp.models.ContactData;
import mm.bookingapp.models.Place;

public class EntitiesConverter {

    public static Place placeEntityToPlaceModel(PlaceDataEntity placeEntity) {
        return new Place(
                placeEntity.getId(),
                placeEntity.getPlaceName(),
                placeEntity.getIsAvailable(),
                placeEntity.getPlaceDescription(),
                new ContactData(
                        placeEntity.getCityName(),
                        placeEntity.getStreetName(),
                        placeEntity.getPostalCode(),
                        placeEntity.getStreetNum(),
                        placeEntity.getApartmentNum()
                )
        );
    }
}
