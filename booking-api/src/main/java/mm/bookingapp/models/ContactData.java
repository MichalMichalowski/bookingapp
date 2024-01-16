package mm.bookingapp.models;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactData {
    private String cityName;
    private String streetName;
    private String postalCode;
    private Long streetNum;
    private Long apartmentNum;
}