package mm.bookingapp.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "Places_V")
@Getter
public class PlaceDataEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "placeName")
    String placeName;
    @Column(name = "isAvailable")
    String isAvailable;
    @Column(name = "placeDescription")
    String placeDescription;
    @Column(name = "cityName")
    String cityName;
    @Column(name = "streetName")
    String streetName;
    @Column(name = "postalCode")
    String postalCode;
    @Column(name = "streetNum")
    Long streetNum;
    @Column(name = "apartmentNum")
    Long apartmentNum;
}
