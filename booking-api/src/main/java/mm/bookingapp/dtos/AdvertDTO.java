package mm.bookingapp.dtos;

import lombok.Getter;

@Getter
public class AdvertDTO {
    private Long userId;
    private String placeName;
    private String placeDescription;
    private String cityName;
    private String streetName;
    private String postalCode;
    private Long streetNum;
    private Long apartmentNum;
}
