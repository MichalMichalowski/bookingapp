package mm.bookingapp.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "Adverts")
@Getter
public class AdvertEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "userId")
    Long userId;
    @Column(name = "placeId")
    Long placeId;
}
