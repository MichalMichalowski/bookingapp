package mm.bookingapp.repositories;

import mm.bookingapp.entities.PlaceDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlacesEntityRepository extends JpaRepository<PlaceDataEntity, Long> {
}
