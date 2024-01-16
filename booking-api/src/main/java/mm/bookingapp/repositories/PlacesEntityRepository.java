package mm.bookingapp.repositories;

import mm.bookingapp.entities.PlaceDataViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlacesEntityRepository extends JpaRepository<PlaceDataViewEntity, Long> {
}
