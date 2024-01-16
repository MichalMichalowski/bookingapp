package mm.bookingapp.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "Places_V")
@Getter
public class PlaceDataViewEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "placeName")
    String placeName;
    @Column(name = "placeDescription")
    String placeDescription;
    @Column(name = "firstName")
    String firstName;
    @Column(name = "lastName")
    String lastName;
    @Column(name = "company")
    String company;
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
