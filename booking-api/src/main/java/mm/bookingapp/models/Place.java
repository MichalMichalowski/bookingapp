package mm.bookingapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Place {
    private Long id;
    private String placeName;
    private String isAvailable;
    private String placeDescription;
    private ContactData contactData;
}
