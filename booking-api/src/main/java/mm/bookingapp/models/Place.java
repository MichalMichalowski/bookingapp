package mm.bookingapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Place {
    private Long id;
    private String placeName;
    private String placeDescription;
    private ContactData contactData;
    private OwnerData ownerData;
}
