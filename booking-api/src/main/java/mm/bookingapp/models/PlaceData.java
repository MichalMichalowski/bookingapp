package mm.bookingapp.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
public class PlaceData {
    protected Long placeId;
    protected String placeName;
    protected String placeDescription;
    protected String company;
    protected String firstName;
    protected String lastName;
    protected String cityName;
    protected String streetName;
    protected String postalCode;
    protected Long streetNum;
    protected Long apartmentNum;
}
