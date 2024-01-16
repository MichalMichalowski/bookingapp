package mm.bookingapp.utils;

import mm.bookingapp.entities.PlaceDataViewEntity;
import mm.bookingapp.models.ContactData;
import mm.bookingapp.models.OwnerData;
import mm.bookingapp.models.Place;

public class EntitiesConverter {

    public static Place placeEntityToPlaceModel(PlaceDataViewEntity placeEntity) {
        ContactData contactData = ContactData.builder()
                .cityName(placeEntity.getCityName())
                .streetName(placeEntity.getStreetName())
                .postalCode(placeEntity.getPostalCode())
                .streetNum(placeEntity.getStreetNum())
                .apartmentNum(placeEntity.getApartmentNum()).build();
        OwnerData ownerData = OwnerData.builder()
                .company(placeEntity.getCompany())
                .firstName(placeEntity.getFirstName())
                .lastName(placeEntity.getLastName()).build();
        return Place.builder()
                .id(placeEntity.getId())
                .placeName(placeEntity.getPlaceName())
                .placeDescription(placeEntity.getPlaceDescription())
                .contactData(contactData)
                .ownerData(ownerData).build();
    }
}
