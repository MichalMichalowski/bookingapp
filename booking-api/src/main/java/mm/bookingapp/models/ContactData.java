package mm.bookingapp.models;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContactData {
    private String cityName;
    private String streetName;
    private String postalCode;
    private Long streetNum;
    private Long apartmentNum;
}